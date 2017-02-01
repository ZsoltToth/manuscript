package manuscript.module.user.management.registration;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import manuscript.module.user.management.exception.PasswordParityCheckFailedException;
import manuscript.module.user.management.exception.UserNameAlreadyUsedException;
import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.BasicRespons;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller
@RequestMapping(value = "/registration")
public class UserRegistrationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationController.class);

	@Autowired
	private UserRegistrationService userRegistrationService;

	@RequestMapping("/preload")
	@ResponseBody
	public UserRegistrationPreloadResponse proload() {
		return userRegistrationService.userRegistrationPreload();
	}

	@RequestMapping(value = "/create")
	@ResponseBody
	public UserRegistrationResponse createRegistration(@RequestBody @Valid UserRegistrationRequest request,
			BindingResult result) {
		UserRegistrationResponse response = new UserRegistrationResponse();

		if (result.hasErrors()) {
			response.setFieldError(result.getFieldErrors());
			return response;
		}

		return userRegistrationService.createRegistration(request);
	}



}
