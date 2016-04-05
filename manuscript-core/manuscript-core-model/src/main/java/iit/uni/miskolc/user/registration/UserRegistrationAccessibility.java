package iit.uni.miskolc.user.registration;

/**
 * Defines a new registered users accessibility
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationAccessibility {
	private String email;
	private String phoneNumber;
	private UserRegistrationAddress address;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserRegistrationAddress getAddress() {
		return address;
	}

	public void setAddress(UserRegistrationAddress address) {
		this.address = address;
	}

}
