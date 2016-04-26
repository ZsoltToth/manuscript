package iit.uni.miskolc.controller.request;

import java.util.Date;

import iit.uni.miskolc.exception.handling.BusinessMessageAwareException;
import iit.uni.miskolc.model.address.Address;
import iit.uni.miskolc.model.user.User;

public class UserRegistrationRequest {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Date birthDate;
	private String personalDescription;
	private String email;
	private String phoneNumber;
	private Address address;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPersonalDescription() {
		return personalDescription;
	}

	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User createUser() throws BusinessMessageAwareException {
		return new User(firstName, lastName, userName, password, birthDate, personalDescription, email, phoneNumber,
				address);
	}

	@Override
	public String toString() {
		return "UserRegistrationRequest [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", birthDate=" + birthDate + ", personalDescription=" + personalDescription
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}
