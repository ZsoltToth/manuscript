package manuscript.module.user.management.registration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.registration.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	private final static Logger LOGGER = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);

	@Autowired
	private UserRegistrationDao userRegistrationDao;

	@Override
	public UserRegistrationPreloadResponse userRegistrationPreload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request) {
		UserRegistrationResponse response = new UserRegistrationResponse();
		User user = new User();

		if (isNameReserved(request.getUser().getUserName())
				&& passwordParityCheck(request.getUser().getPassword(), request.getPasswordAgain())) {
			// TODO throw user name is reserved. return with error message
			return response;
		}
		
		user = request.getUser();	
		user.setPassword(getEncodedPassword(request.getPasswordAgain()));
		
		LOGGER.debug("New user object: {}", user);
		
		return null;
	}

	private boolean isNameReserved(String userName) {
		return userRegistrationDao.isNameReserved(userName);
	}

	/**
	 * Password parity check. //TODO: fix it
	 * 
	 * @param password
	 * @param passwordAgain
	 * @return true if the two password are the same. Otherwise false.
	 */
	private boolean passwordParityCheck(String password, String passwordAgain) {
		if (password.equals(passwordAgain)) {
			LOGGER.debug("Password parity check was succes. {} - {}", password, passwordAgain);
			return true;
		}
		LOGGER.debug("Password parity check failed. {} - {}", password, passwordAgain);
		return false;
	}

	/**
	 * Generate an encoded hash password with random salt.
	 * 
	 * @param password
	 * @return generated hash password
	 */
	private String getEncodedPassword(String password) {
		String encodedPassword = new BCryptPasswordEncoder().encode(password);
		LOGGER.debug("Encoded password from {} is {}", password, encodedPassword);

		return encodedPassword;
	}

}
