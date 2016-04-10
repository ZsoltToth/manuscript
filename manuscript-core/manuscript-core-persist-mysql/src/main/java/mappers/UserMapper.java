package iit.uni.miskolc.user.mapper;

import iit.uni.miskolc.user.registration.User;

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
	
	void editUserData(User user);
}
