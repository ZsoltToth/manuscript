package manuscript.module.user.management.registration;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import manuscript.module.user.management.bean.AdditionalData;
import manuscript.module.user.management.bean.Password;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.exception.PasswordParityCheckFailedException;
import manuscript.module.user.management.exception.UserNameAlreadyUsedException;
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

	private final static Logger LOGGER = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);

	private UserRegistrationDao userRegistrationDao;

	public UserRegistrationServiceImpl(UserRegistrationDao userRegistrationDao) {
		this.userRegistrationDao = userRegistrationDao;
	}

	@Override
	public UserRegistrationPreloadResponse userRegistrationPreload() {
		UserRegistrationPreloadResponse response = new UserRegistrationPreloadResponse();
		response.setAcademicDisciplines(userRegistrationDao.getAcademicDisciplines());
		return response;
	}

	@Override
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request) throws UserNameAlreadyUsedException {
		UserRegistrationResponse response = new UserRegistrationResponse();
		AdditionalData additionalData = new AdditionalData();

		if (isNameReserved(request.getUser().getUserName())) {
			LOGGER.error("{} is already used.", request.getUser().getUserName());
			throw new UserNameAlreadyUsedException("User name is already used! ");
		}

		passwordParityCheck(request.getPassword());
		additionalData.setDefaultRoles(getDefaultRoles());

		try {
			userRegistrationDao.createRegistration(request, additionalData);
			LOGGER.debug("Registration success. Created user is {}", request.getUser());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	private boolean isNameReserved(String userName) {
		return userRegistrationDao.isNameReserved(userName);
	}

	/**
	 * Check that the given password are the same or not. If the password are
	 * the same do nothing, otherwise throw PasswordParityCheckFailedException
	 */
	private void passwordParityCheck(Password password) {
		if (password.getPassword().equals(password.getPasswordAgain())) {
			LOGGER.debug("Password parity check was succes: ", password);

			password.setPassword(getEncodedPassword(password.getPassword()));
		} else {
			LOGGER.debug("Password parity check failed: ", password);
			throw new PasswordParityCheckFailedException(
					"Password parity check failed. The given passwords are not mached.");
		}

	}

	/**
	 * Generate an encoded hash password with random salt.
	 * 
	 * @param password
	 * @return generated hash password
	 */
	private String getEncodedPassword(String password) {
		String encodedPassword = new BCryptPasswordEncoder().encode(password);
		LOGGER.debug("Encoded password is {}", encodedPassword);

		return encodedPassword;
	}

	private List<Role> getDefaultRoles() {
		return userRegistrationDao.getDefaultRole();
	}

}
