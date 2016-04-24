package iit.uni.miskolc.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import iit.uni.miskolc.exception.handling.BusinessMessageAwareException;
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
	private List<Exception> exceptions;
	Regexp regex;

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
		try {
			if (firstName == null) {
				throw new IllegalArgumentException("This field is required");
			} else if (!firstName.matches(regex.NAME_VALIDATION_REGEXP)) {
				throw new IllegalArgumentException("Invalid name, please try again!");
			}

			this.firstName = firstName;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		try {
			if (lastName == null) {
				throw new IllegalArgumentException("This field is required");
			} else if (!lastName.matches(regex.NAME_VALIDATION_REGEXP)) {
				throw new IllegalArgumentException("Invalid name, please try again!");
			}

			this.lastName = lastName;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		try {
			if (userName == null) {
				throw new IllegalArgumentException("This field is required");
			} else if (!userName.matches(regex.USER_NAME_VALIDATION_REGEXP)) {
				throw new IllegalArgumentException("Invalid name, please try again!");
			}

			this.userName = userName;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		try {
			if (password == null) {
				throw new IllegalArgumentException("This field is required");
			} else if (!password.matches(regex.PASSWORD_REGEXP)) {
				throw new IllegalArgumentException("Invalid password");
			}
			this.password = password;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}

	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		try {
			if (birthDate == null) {
				throw new IllegalArgumentException("This field is required");
			} else if (birthDate.after(new Date())) {
				throw new IllegalArgumentException("Date must be in the past");
			}
			this.birthDate = birthDate;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}

	}

	public String getPersonalDescription() {
		return personalDescription;
	}

	public void setPersonalDescription(String personalDescription) {
		try {
			if (personalDescription == null) {
				this.personalDescription = personalDescription;
			} else if (personalDescription.length() > 250) {
				throw new IllegalArgumentException("Discription is too long");
			}
			this.personalDescription = personalDescription;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}

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
		try {
			if (email == null) {
				throw new IllegalArgumentException("This field is required");
			} else if (!email.matches(regex.EMAIL_PATTERN)) {
				throw new IllegalArgumentException("Invalid email, please try again!");
			}
			this.email = email;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			exceptions.add(e);
		}
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

}
