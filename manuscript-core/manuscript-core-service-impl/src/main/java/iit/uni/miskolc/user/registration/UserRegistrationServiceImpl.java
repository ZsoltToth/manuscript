package iit.uni.miskolc.user.registration;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import iit.uni.miskolc.model.user.User;
import iit.uni.miskolc.user.registration.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	private final static Logger logger = Logger.getLogger(UserRegistrationServiceImpl.class);

	@Override
	public void createUser(User user) {
		logger.info("User validation succesfully finished: " + user);
	}

}
