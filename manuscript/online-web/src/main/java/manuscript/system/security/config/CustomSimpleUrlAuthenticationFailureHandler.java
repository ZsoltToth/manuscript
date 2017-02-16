package manuscript.system.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.google.gson.Gson;

public class CustomSimpleUrlAuthenticationFailureHandler implements AuthenticationFailureHandler{

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomSimpleUrlAuthenticationFailureHandler.class);
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		LOGGER.debug("Exception occured during authentication!", exception);
		
		response.setContentType("application/json");
		response.setStatus(400);

		ReplyObject reply = new ReplyObject();

		reply.setSuccess("false");
		reply.setErrorMessage("Wrong username or password. Please try again.");

		Gson gson = new Gson();

		byte[] b = gson.toJson(reply).getBytes();

		response.setContentLength(b.length);
		response.getOutputStream().write(b);
		
	}

}
