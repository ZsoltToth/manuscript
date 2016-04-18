package iit.uni.miskolc.controller.test;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/manuscript")
public class ManuscriptsController {
	private final static Logger logger = Logger.getLogger(ManuscriptsController.class);

	@RequestMapping("/upload")
	public String uploadManuscript() {
		logger.info("upload manuscript has invoked!");
		return null;
	}
}
