package iit.uni.miskolc.controller.request;

import javax.naming.directory.InvalidAttributesException;

import iit.uni.miskolc.mode.user.User;

public class UserRegistrationRequest {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User createUser() throws InvalidAttributesException {
		return new User(firstName, lastName);
	}
}
