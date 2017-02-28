package manuscript.system.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.google.gson.Gson;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class CustomerAccessDeniedHandlerImpl implements AccessDeniedHandler {

	private String defaultErrorUrl;

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		if (!response.isCommitted()) {
			if (defaultErrorUrl != null) {
				// Set the 403 status code.
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);
				response.setContentType("application/json");

				AccessDeniedReply reply = new AccessDeniedReply();
				reply.setErrorMessage(accessDeniedException.getMessage());
				reply.setSuccess(false);
				reply.setDefaultUrl(defaultErrorUrl);

				Gson gson = new Gson();
				byte[] b = gson.toJson(reply).getBytes();

				response.setContentLength(b.length);
				response.getOutputStream().write(b);

			} else {
				response.sendError(HttpServletResponse.SC_FORBIDDEN, accessDeniedException.getMessage());
			}
		}

	}

	public void setDefaultErrorUrl(String defaultErrorUrl) {
		if ((defaultErrorUrl != null) && !defaultErrorUrl.startsWith("/")) {
			throw new IllegalArgumentException("defaultErrorUrl must begin with '/'");
		}

		this.defaultErrorUrl = defaultErrorUrl;
	}

}
