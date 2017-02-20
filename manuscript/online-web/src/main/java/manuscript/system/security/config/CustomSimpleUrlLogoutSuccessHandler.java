package manuscript.system.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import com.google.gson.Gson;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class CustomSimpleUrlLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		ReplyObject reply = new ReplyObject();

		reply.setSuccess("true");

		Gson gson = new Gson();

		byte[] b = gson.toJson(reply).getBytes();

		response.setContentLength(b.length);
		response.getOutputStream().write(b);
	}
}
