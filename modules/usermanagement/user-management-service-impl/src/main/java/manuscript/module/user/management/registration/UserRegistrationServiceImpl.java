package manuscript.module.user.management.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manuscript.module.user.management.registration.UserRegistrationService;
import manuscript.module.user.management.registration.request.UserRegistrationPreloadRequest;
import manuscript.module.user.management.registration.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationCheckNameResponse;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationDao userRegistrationDao;

	@Override
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistrationPreloadResponse userRegistrationPreload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistrationCheckNameResponse isNameReserved(String userName) {
		
		UserRegistrationCheckNameResponse response = new UserRegistrationCheckNameResponse();
		
				
		return response;
	}

}
