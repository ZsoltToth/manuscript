package iit.uni.miskolc.mode.user;

import javax.naming.directory.InvalidAttributesException;

import iit.uni.miskolc.validator.basic.Validator;

/**
 * Define a new user in the system with ROLE_USER role. This user has
 * availability to modify own data only.
 * 
 * @author Balazs Kovacs
 *
 */
public class User extends Validator {
	private String firstName;
	private String lastName;

	// private String userName;
	// private String password;
	// private Date birthDate;
	// private String personalDescription;
	// private Date registrationDate;
	// private String email;
	// private String phoneNumber;

	private void user() {
		// TODO Auto-generated method stub

	}

	public User(String firstName, String lastName) throws InvalidAttributesException {
		super();
		if (isNull(firstName)) {
			throw new InvalidAttributesException("Nem lehet null a firstname!");
		} else {
			this.firstName = firstName;
		}

		if (isNull(lastName)) {
			throw new InvalidAttributesException("Nem lehet null a lastName!");
		} else {
			this.lastName = lastName;
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

}
