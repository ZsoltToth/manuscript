package iit.uni.miskolc.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import iit.uni.miskolc.exception.handling.UserValidationException;
import iit.uni.miskolc.exception.handling.Regexp;
import iit.uni.miskolc.model.address.Address;

/**
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

	public User() {
	}

	public User(String firstName, String lastName, String userName, String password, Date birthDate,
			String personalDescription, String email, String phoneNumber, Address address)
			throws UserValidationException {
		super();

		List<Exception> exceptions = new ArrayList<Exception>();

		try {
			setFirstName(firstName);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		try {
			setLastName(lastName);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setUserName(userName);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setPassword(password);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setBirthDate(birthDate);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setPersonalDescription(personalDescription);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setRegistrationDate(new Date());
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		try {
			setPhoneNumber(phoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}
		try {
			setAddress(address);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		if (!exceptions.isEmpty()) {
			throw new UserValidationException(exceptions);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		nameValidation(firstName);
		this.firstName = firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		nameValidation(lastName);
		this.lastName = lastName;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		nameValidation(userName);
		this.userName = userName;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		if (password == null) {
			throw new IllegalArgumentException("This field is required");
		} else if (!password.matches(Regexp.PASSWORD_REGEXP)) {
			throw new IllegalArgumentException("Invalid password");
		}

		this.password = passwordEncoder(password);

	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		if (birthDate == null) {
			throw new IllegalArgumentException("This field is required");
		} else if (birthDate.after(new Date())) {
			throw new IllegalArgumentException("Date must be in the past");
		}
		this.birthDate = birthDate;
	}

	public String getPersonalDescription() {
		return personalDescription;
	}

	public void setPersonalDescription(String personalDescription) {
		if (personalDescription == null) {
			this.personalDescription = personalDescription;
		} else if (personalDescription.length() > 250) {
			throw new IllegalArgumentException("Discription is too long");
		}
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
		if (email == null) {
			throw new IllegalArgumentException("This field is required");
		} else if (!email.matches(Regexp.EMAIL_VALIDATION_REGEXP)) {
			throw new IllegalArgumentException("Invalid email, please try again!");
		}
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

	private void nameValidation(String name) {
		if (name == null) {
			throw new IllegalArgumentException("This field is required");
		} else if (!name.matches(Regexp.USER_NAME_VALIDATION_REGEXP)) {
			throw new IllegalArgumentException("Invalid name, please try again!");
		}
	}

	private String passwordEncoder(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", birthDate=" + birthDate + ", personalDescription=" + personalDescription
				+ ", registrationDate=" + registrationDate + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}

}
