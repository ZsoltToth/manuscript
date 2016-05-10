package iit.uni.miskolc.mybatis.mappers;

import java.util.Collection;

import iit.uni.miskolc.model.user.User;

/**
 * 
 * @author Bence Varadi
 *
 */
public interface UserMapper {
	
	Collection<User> selectUsers();
	
	User selectUserByUsername(String username);
	
	void insertUser(User user);
	
	void deleteUserByUsername(String username);
	
	void updateUserData(User user);
	
	void setUserRole(String role);
}
