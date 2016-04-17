package iit.uni.miskolc.controller.test;

import javax.naming.directory.InvalidAttributesException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import iit.uni.miskolc.controller.request.UserRegistrationRequest;
import iit.uni.miskolc.controller.response.UserRegistrationResponse;
import iit.uni.miskolc.mode.user.User;

@Controller
public class TestController {
	private final static Logger logger = Logger.getLogger(TestController.class);

	@RequestMapping("/index")
	public String Hello(Model model) {
		return "index";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	@ResponseBody
	public UserRegistrationResponse addNewUser(@RequestBody UserRegistrationRequest request) throws InvalidAttributesException {
		User user = request.createUser();

		return null;
	}
}
