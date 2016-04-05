package iit.uni.miskolc.user.registration;

import java.util.Date;

/**
 * Define a new user in the system with ROLE_USER role. This user has
 * availability to modify own data only.
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistration {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Date dateOfBirth;
	private String personalDescription;
	private String role;
	private Date registrationDate;
	private UserRegistrationAccessibility accessibility;

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPersonalDescription() {
		return personalDescription;
	}

	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public UserRegistrationAccessibility getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(UserRegistrationAccessibility accessibility) {
		this.accessibility = accessibility;
	}

}
