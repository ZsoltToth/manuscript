package iit.uni.miskolc.index.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private final static Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping("/index")
	public String index() {
		logger.info("/index has invoked!");
		return "index";
	}
}
