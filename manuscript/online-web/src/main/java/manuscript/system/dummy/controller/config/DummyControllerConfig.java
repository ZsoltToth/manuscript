package manuscript.system.dummy.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import manuscript.system.dummy.controller.DummyController;

@Configuration
public class DummyControllerConfig {

	@Bean
	public DummyController dummyController() {
		return new DummyController();
	}
}
