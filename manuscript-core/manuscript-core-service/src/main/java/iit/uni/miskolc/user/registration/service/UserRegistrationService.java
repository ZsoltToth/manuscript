package iit.uni.miskolc.user.registration.service;

import iit.uni.miskolc.model.user.User;

/**
 * Contains all method that needed to sign up a user.
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationService {
	/**
	 * Create a user.
	 * 
	 * @param user
	 */
	public void createUser(User user);

}
