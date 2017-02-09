package manuscript.system.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.google.gson.Gson;

public class CustomSimpleUrlAuthenticationFailureHandler implements AuthenticationFailureHandler{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		System.err.println("EXCEPTION #####################################x" + exception.getMessage());
		
		response.setContentType("application/json");
		response.setStatus(400);

		ReplyObject reply = new ReplyObject();

		reply.setSuccess("true");
		reply.setErrorMessage("SZAR van a palacsinátban");

		Gson gson = new Gson();

		byte[] b = gson.toJson(reply).getBytes();

		response.setContentLength(b.length);
		response.getOutputStream().write(b);
		
	}

}
