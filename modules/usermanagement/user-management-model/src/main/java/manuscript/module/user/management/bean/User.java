package manuscript.module.user.management.bean;

import manuscript.validation.custom.annotation.NotNull;

/**
 * 
 * 
 * @author Balazs Kovacs
 *
 */
public class User {

	@NotNull(message = "The title field is required!")
	private String title;

	@NotNull(message = "The first name field is required!")
	private String firstName;

	@NotNull(message = "The last name field is required!")
	private String lastName;

	@NotNull(message = "The user name field is required!")
	private String userName;

	@NotNull(message = "The job field is required!")
	private String job;

	@NotNull(message = "The email field is required!")
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String title, String firstName, String lastName, String userName, String job, String email) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.job = job;
		this.email = email;
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

}
