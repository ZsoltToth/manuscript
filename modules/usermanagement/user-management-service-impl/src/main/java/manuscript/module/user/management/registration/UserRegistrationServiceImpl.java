package manuscript.module.user.management.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manuscript.module.user.management.registration.UserRegistrationService;
import manuscript.module.user.management.request.UserRegistrationPreloadRequest;
import manuscript.module.user.management.request.UserRegistrationRequest;
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
	private UserRegistrationDao dao;

	@Override
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request) {

		isUserNameExists(request.getUser().getUserName());

		UserRegistrationResponse response = new UserRegistrationResponse();
		response.setDummy("köszi megjött");
		return response;
	}

	private void isUserNameExists(String userName) {
		dao.getUserName(userName);
	}

	@Override
	public UserRegistrationPreloadResponse userRegistrationPreload(UserRegistrationPreloadRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
}
