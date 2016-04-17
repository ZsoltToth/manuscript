package mappers;

import java.util.Collection;

import iit.uni.miskolc.mode.user.User;

/**
 * 
 * @author Bence Varadi
 *
 */
public interface UserMapper {
	
	Collection<User> selectUsers();
	
	User selectUserByID(String id);
	
	void insertUser(User user);
	
	void deleteUserByID(String id);
	
	void updateUserData(User user);
}
