package manuscript.module.user.management.registration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import manuscript.module.user.management.registration.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;

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
	public List<FieldError> createRegistration(@RequestBody @Valid UserRegistrationRequest request,
			BindingResult result) {
		if (result.hasErrors()) {
			List<FieldError> errors = new ArrayList<FieldError>();
			errors = result.getFieldErrors();
			Iterator<FieldError> iterator = errors.iterator();
			while (iterator.hasNext()) {
				FieldError error = iterator.next();
				System.out.println("CODE: "+error.getCode()+" MESSAGE: "+error.getDefaultMessage());
				System.out.println("REJECTED VALUE: " + error.getRejectedValue());
				System.out.println("GET FIELD: " + error.getField());
				System.out.println("==================== ");
			}
			return result.getFieldErrors();
		}

		// userRegistrationService.createRegistration(request);
		return null;
	}

}
