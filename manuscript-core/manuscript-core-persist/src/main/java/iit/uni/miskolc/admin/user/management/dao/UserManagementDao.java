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
	 * @return the list of the users
	 */
	public List<User> getAllUser();
	
	/**
	 * Get back a user by the user name.
	 * @param name of the user 
	 * @return the searched user
	 */
	public User getUserByUserName(String userName);
	
	/**
	 * Get back a user by the id
	 * @param id of the user
	 * @return the searched user
	 */
	public User getUserById(Integer id);
	
	/**
	 * Delete a user from the database by the id.
	 * @param id of the user
	 */
	public void deleteUserById(Integer id);
	
	/**
	 * Update the role of the user.
	 * @param userName of the user
	 * @param role of the user
	 */
	public void setRoleById(String userName, String role);
	
	/**
	 * Get back the role of the user.
	 * @param id of the user
	 * @return the role of the user
	 */
	public String getUserRoleBy(Integer id);
	
	/**
	 * update the user's data
	 * @param user
	 */
	public void updateUser(User user);
}
