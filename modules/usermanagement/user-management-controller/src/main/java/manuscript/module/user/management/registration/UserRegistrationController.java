package manuscript.module.user.management.registration;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import manuscript.module.user.management.registration.request.UserRegistrationRequest;
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

	@Autowired
	private UserRegistrationService userRegistrationService;

	@RequestMapping("/preload")
	@ResponseBody
	public UserRegistrationPreloadResponse proload() {
		return null;
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

		// userRegistrationService.createRegistration(request);
		return null;
	}

}
