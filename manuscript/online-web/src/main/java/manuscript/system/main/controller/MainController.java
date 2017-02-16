package manuscript.system.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(path = "/")
	public String getLogin() {
		return "static/login.html";
	}
	
	@RequestMapping(path = "/index.html")
	public String getIndex() {
		UserDetails userDetails =
				 (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		LOGGER.debug("FULLY LOADED PRINCIPAL, {}", userDetails);
		return "static/index.html";
	}
}
