package manuscript.system.dummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {

	@RequestMapping(value = "/")
	public String indexHtml() {
		System.out.println("Hello");
		return "index";
	}
}
