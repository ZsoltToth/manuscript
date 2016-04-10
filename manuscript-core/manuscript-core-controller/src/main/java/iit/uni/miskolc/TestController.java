package iit.uni.miskolc;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import iit.uni.miskolc.registration.UserRegistrationService;
import iit.uni.miskolc.user.registration.UserRegistrationRequest;
import iit.uni.miskolc.user.registration.UserRegistrationResponse;

@Controller
public class TestController {
	private final static Logger logger = Logger.getLogger(TestController.class);

	@Autowired
	private UserRegistrationService registration;

	@RequestMapping("/index")
	public String Hello(Model model) {
		return "index";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	@ResponseBody
	public UserRegistrationResponse addNewUser(@RequestBody UserRegistrationRequest request) {
		logger.info("/registration has invoked!");
		UserRegistrationResponse response = registration.registration1(request);
		return response;
	}
}
