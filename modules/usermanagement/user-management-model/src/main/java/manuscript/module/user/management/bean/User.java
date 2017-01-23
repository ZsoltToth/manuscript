package manuscript.module.user.management.bean;

import manuscript.validation.custom.annotation.NotNull;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class User {

	@NotNull
	private String title;

	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	@NotNull
	private String userName;

	@NotNull
	private String job;

	@NotNull
	private String email;

	@NotNull
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String title, String firstName, String lastName, String userName, String job, String email,
			String password) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.job = job;
		this.email = email;
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [" + (title != null ? "title=" + title + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (userName != null ? "userName=" + userName + ", " : "") + (job != null ? "job=" + job + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (password != null ? "password=" + password : "")
				+ "]";
	}

}
