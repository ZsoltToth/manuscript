package manuscript.system.main.controller;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import manuscript.system.security.bean.AuthenticatedUser;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(path = "/")
	public String getLogin(HttpServletResponse response) {
		response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
		return "static/login.html";
	}

	@RequestMapping(path = "/index.html")
	public String getIndex(HttpServletResponse response) {
		response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
		AuthenticatedUser userDetails = (AuthenticatedUser) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		LOGGER.debug("FULLY LOADED PRINCIPAL, {}", userDetails);
		return "static/index.html";
	}

	@RequestMapping(path = "/login.html")
	public String getLoginFromSuccesLogout() {
		return "static/login.html";
	}
}
