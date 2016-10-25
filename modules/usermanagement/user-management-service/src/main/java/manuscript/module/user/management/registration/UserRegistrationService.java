package manuscript.module.user.management.registration;

import manuscript.module.user.management.registration.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationCheckNameResponse;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * It will contains all method that related with the
 * registration process.  
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationService {

	/**
	 * It will start the registration process. 
	 * 
	 * @param UserRegistrationRequest
	 * @return UserRegistrationResponse
	 */
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request);

	/**
	 * Return all necessary data that will able to use the user under the registration process.
	 * 
	 * @return UserRegistrationPreloadResponse
	 */
	public UserRegistrationPreloadResponse userRegistrationPreload();
	
	/**
	 * Check that if selected user name is unique or not.
	 * 
	 * @param The user's user name
	 * @return UserRegistrationCheckNameResponse
	 */
	public UserRegistrationCheckNameResponse isNameReserved(String userName);
}
