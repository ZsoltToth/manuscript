package iit.uni.miskolc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import iit.uni.miskolc.user.registration.UserRegistration;
import iit.uni.miskolc.user.registration.UserRegistrationAccessibility;

@Controller
public class TestController {

	@RequestMapping("/index")
	public String Hello(Model model) {
		return "index";
	}
}
