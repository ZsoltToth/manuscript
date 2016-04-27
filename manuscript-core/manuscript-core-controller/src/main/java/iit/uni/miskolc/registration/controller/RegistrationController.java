package iit.uni.miskolc.registration.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import iit.uni.miskolc.controller.request.UserRegistrationRequest;
import iit.uni.miskolc.controller.response.UserRegistrationResponse;
import iit.uni.miskolc.exception.handling.UserValidationException;
import iit.uni.miskolc.user.registration.UserRegistrationService;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

	private final static Logger logger = Logger.getLogger(RegistrationController.class);

	private UserRegistrationResponse response;

	@Autowired
	private UserRegistrationService registration;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public UserRegistrationResponse userRegistration(@RequestBody UserRegistrationRequest request)
			throws UserValidationException {
		logger.info("User register : " + request.toString());
		// User user = request.createUser();
		registration.createUser(request.createUser());

		return new UserRegistrationResponse(); // the response mechanism did not
												// finish
	}

	@ExceptionHandler(UserValidationException.class)
	@ResponseBody
	public UserRegistrationResponse handleMyAppTechnicalException(UserValidationException e, Model model) {
		response = new UserRegistrationResponse();
		response.setErrorMessages(e.getException());
		logger.info("User registration return the following error messages: " + response.getErrorMessages());

		return response;
	}

}
