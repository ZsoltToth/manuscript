package manuscript.system.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

import com.google.gson.Gson;

public class CustomSavedRequestAwareAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		HttpSession session = request.getSession(false);

		if (session == null) {
			throw new SessionAuthenticationException("VALAMI SZAR VAN");
		}

		session.setAttribute("ASDADASDASD", "asdadadad");
		response.setContentType("application/json");

		ReplyObject reply = new ReplyObject();

		reply.setSuccess("true");
		reply.setSession(session.getId());

		Gson gson = new Gson();

		byte[] b = gson.toJson(reply).getBytes();

		response.setContentLength(b.length);
		response.getOutputStream().write(b);
	}

}