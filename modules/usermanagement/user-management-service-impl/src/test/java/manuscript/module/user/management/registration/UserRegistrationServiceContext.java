package manuscript.module.user.management.registration;

import org.easymock.EasyMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import manuscript.test.annotation.IgnoreTestContext;

@IgnoreTestContext
@Configuration
public class UserRegistrationServiceContext {

	@Bean
	public UserRegistrationService getUserRegistrationService() {
		return new UserRegistrationServiceImpl(getUserRegistrationDao());
	}

	@Bean
	public UserRegistrationDao getUserRegistrationDao() {
		return EasyMock.createMock(UserRegistrationDao.class);
	}
}
