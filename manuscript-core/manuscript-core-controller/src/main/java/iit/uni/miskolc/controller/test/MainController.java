package iit.uni.miskolc.controller.test;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private final static Logger logger = Logger.getLogger(MainController.class);

	@RequestMapping("/index")
	public String index() {
		logger.info("/index has invoked!");
		return "index";
	}
}
