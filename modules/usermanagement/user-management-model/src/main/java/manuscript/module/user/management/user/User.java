package manuscript.module.user.management.user;

import java.sql.Date;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class User {

	private String userName;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String firstName, String lastName, Date birthDate, String phoneNumber) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
