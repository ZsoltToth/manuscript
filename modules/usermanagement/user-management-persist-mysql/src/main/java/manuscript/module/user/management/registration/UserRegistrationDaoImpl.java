package manuscript.module.user.management.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import manuscript.module.user.management.registration.mapper.UserRegistrationMapper;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Repository
public class UserRegistrationDaoImpl implements UserRegistrationDao {

	@Autowired
	private UserRegistrationMapper userRegistrationMapper;

	@Override
	public boolean isNameReserved(String userName) {
		return userRegistrationMapper.isUserNameReserved(userName) > 0 ? true : false;
	}

}
