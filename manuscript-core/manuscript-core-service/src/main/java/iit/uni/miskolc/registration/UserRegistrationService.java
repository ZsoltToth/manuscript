package iit.uni.miskolc.registration;

import iit.uni.miskolc.user.registration.UserRegistrationRequest;
import iit.uni.miskolc.user.registration.UserRegistrationResponse;

public interface UserRegistrationService {
	public void registration(UserRegistrationRequest request);
	public UserRegistrationResponse registration1(UserRegistrationRequest request);
}
