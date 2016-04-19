package iit.uni.miskolc.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import iit.uni.miskolc.exception.handling.BusinessMessageAwareException;
import iit.uni.miskolc.model.address.Address;

/**
 * Define a new user in the system with ROLE_USER role. This user has
 * availability to modify own data only.
 * 
 * @author Balazs Kovacs
 *
 */
public class User {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Date birthDate;
	private String personalDescription;
	private Date registrationDate;
	private String email;
	private String phoneNumber;
	private Address address;
	private List<Exception> exceptions;

	public User() {

	}

	public User(String firstName, String lastName, String userName, String password, Date birthDate,
			String personalDescription, String email, String phoneNumber, Address address)
			throws BusinessMessageAwareException {
		super();
		exceptions = new ArrayList<Exception>();
		setFirstName(firstName);
		setLastName(lastName);
		setUserName(userName);
		setPassword(password);
		setBirthDate(birthDate);
		setPersonalDescription(personalDescription);
		setRegistrationDate(new Date());
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setAddress(address);

		if (!exceptions.isEmpty()) {
			throw new BusinessMessageAwareException(exceptions);
		}
	}

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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
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

	public List<Exception> getExceptions() {
		return exceptions;
	}

	public void setExceptions(List<Exception> exceptions) {
		this.exceptions = exceptions;
	}

	// public User(String firstName, String lastName) throws
	// BusinessMessageAwareException {
	// super();
	// exceptions = new ArrayList<Exception>();
	// setFirstName(firstName);
	// setLastName(lastName);
	// if (!exceptions.isEmpty()) {
	// throw new BusinessMessageAwareException(exceptions);
	// }
	//
	// }
	//
	// public String getFirstName() {
	// return firstName;
	// }
	//
	// public void setFirstName(String firstName) {
	// // try {
	// // throw new IllegalArgumentException("excepton 1");
	// // } catch (IllegalArgumentException e) {
	// // e.printStackTrace();
	// // exceptions.add(e);
	// // }
	// // exceptions.add(new IllegalArgumentException("excepton 1"));
	// // this.firstName = firstName;
	// }
	//
	// public String getLastName() {
	// return lastName;
	// }
	//
	// public void setLastName(String lastName) {
	// // exceptions.add(new IllegalArgumentException("excepton 2"));
	// try {
	// throw new IllegalArgumentException("adadasd");
	// } catch (IllegalArgumentException e) {
	// e.printStackTrace();
	// exceptions.add(e);
	// }
	// this.lastName = lastName;
	// }

}