package manuscript.system.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(path = "/")
	public String getIndex() {
		return "static/login.html";
	}
	
//	@RequestMapping(path = "/")
//	public String getIndex() {
//		return "static/login.html";
//	}
}
