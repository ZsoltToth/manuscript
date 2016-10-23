package manuscript.module.user.management.registration;

import manuscript.module.user.management.registration.request.UserRegistrationPreloadRequest;
import manuscript.module.user.management.registration.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationService {

	public UserRegistrationResponse createRegistration(UserRegistrationRequest request);

	public UserRegistrationPreloadResponse userRegistrationPreload(UserRegistrationPreloadRequest request);
}
