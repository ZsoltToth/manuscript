package manuscript.module.user.management.request;

import manuscript.module.user.management.user.Address;
import manuscript.module.user.management.user.User;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationRequest {

	private User user;
	private Address address;
	private String password;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
