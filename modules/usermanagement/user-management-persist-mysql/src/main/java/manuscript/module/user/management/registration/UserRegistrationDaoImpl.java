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

	private static final int IS_USER_NAME_RESERVED = 1;
	
	@Autowired
	private UserRegistrationMapper userRegistrationMapper;

	@Override
	public boolean isNameReserved(String userName) {
		int getNumberOfUserName = userRegistrationMapper.isUserNameReserved(userName);
		
		if (IS_USER_NAME_RESERVED == getNumberOfUserName) {
			return true; //user name is reserved
		}
		
		return false;
	}


}
