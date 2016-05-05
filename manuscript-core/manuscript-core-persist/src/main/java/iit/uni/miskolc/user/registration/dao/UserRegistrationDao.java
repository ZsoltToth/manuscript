package iit.uni.miskolc.user.registration.dao;

import iit.uni.miskolc.model.user.User;

/**
 * Contains all method that needed to sign up a user.
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationDao {
	
	/**
	 * Create a new user in the database.
	 * 
	 * @param user
	 */
	public void createUser(User user);

}
