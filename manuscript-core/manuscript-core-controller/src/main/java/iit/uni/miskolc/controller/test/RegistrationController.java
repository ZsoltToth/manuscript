package iit.uni.miskolc.controller.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import iit.uni.miskolc.controller.request.UserRegistrationRequest;
import iit.uni.miskolc.controller.response.UserRegistrationResponse;
import iit.uni.miskolc.exception.handling.BusinessMessageAwareException;
import iit.uni.miskolc.model.user.User;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {
	private final static Logger logger = Logger.getLogger(RegistrationController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public UserRegistrationResponse userRegistration(@RequestBody UserRegistrationRequest request)
			throws BusinessMessageAwareException {
		logger.info("User registration has invoked!");
		User user = request.createUser();

		return null;
	}
	
	@ExceptionHandler(BusinessMessageAwareException.class)
    public String handleMyAppTechnicalException(BusinessMessageAwareException e, Model model) {
		List<Exception> exceptions = e.getException();
		for (Exception exception : exceptions) {
			logger.error(exception.getMessage());
			exception.printStackTrace();
		}

        return null;
    }

}