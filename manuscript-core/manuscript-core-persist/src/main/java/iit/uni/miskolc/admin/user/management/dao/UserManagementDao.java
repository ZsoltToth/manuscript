package iit.uni.miskolc.admin.user.management.dao;

import java.util.List;

import iit.uni.miskolc.model.user.User;
/**
 * Contains all method that an administrator can do a User.
 * @author Balazs Kovacs
 *
 */
public interface UserManagementDao {

	/**
	 * Get back a list that contains all users.
	 * @return list of users
	 */
	public List<User> getAllUser();
	
	/**
	 * Get back a user by the user name.
	 * @param name of the user 
	 * @return user
	 */
	public User getUserByUserName(String userName);
	
	/**
	 * Get back a user by the id
	 * @param id of the user
	 * @return user
	 */
	public User getUserById(Integer id);
	
	/**
	 * Delete a user from the database by the id.
	 * @param id of the user
	 */
	public void deleteUserById(Integer id);
	
	/**
	 * Update the role of the user.
	 * @param id of the user
	 * @param role
	 */
	public void setRoleById(Integer id, String role);
	
	/**
	 * Get back the role of the user.
	 * @param id of the user
	 * @return
	 */
	public String getUserRoleBy(Integer id);
}
