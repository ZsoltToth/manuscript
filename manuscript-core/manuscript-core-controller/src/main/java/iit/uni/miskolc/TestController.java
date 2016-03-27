package iit.uni.miskolc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping ("/Hello")
	public String Hello(Model model) {
		return "Hello";
	}
}
