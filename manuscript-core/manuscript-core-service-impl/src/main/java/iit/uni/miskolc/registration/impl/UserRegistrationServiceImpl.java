package iit.uni.miskolc.registration.impl;

import org.springframework.stereotype.Service;

import iit.uni.miskolc.registration.UserRegistrationService;
import iit.uni.miskolc.user.registration.User;
import iit.uni.miskolc.user.registration.UserRegistrationRequest;
import iit.uni.miskolc.user.registration.UserRegistrationResponse;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Override
	public void registration(UserRegistrationRequest request) {
		User user = new User(request);

	}

	@Override
	public UserRegistrationResponse registration1(UserRegistrationRequest request) {
		UserRegistrationResponse response = new UserRegistrationResponse();
		
		User user  = new User(request);
		
		if (!user.getErrorMessages().isEmpty()) {
			response.setMessages(user.getErrorMessages());
		}
		return response;
	}

}
