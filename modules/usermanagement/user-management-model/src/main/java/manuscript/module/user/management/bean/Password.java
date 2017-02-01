/**
 * 
 */
package manuscript.module.user.management.bean;

import manuscript.validation.custom.annotation.NotNull;

/**
 * @author Balazs Kovacs
 *
 */
public class Password {

	@NotNull(message = "The password field is required!")
	private String password;

	@NotNull(message = "The password again field is required!")
	private String passwordAgain;

	public Password(String password, String passwordAgain) {
		super();
		this.password = password;
		this.passwordAgain = passwordAgain;
	}

	public Password() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

	@Override
	public String toString() {
		return "Password [" + (password != null ? "password=" + password + ", " : "")
				+ (passwordAgain != null ? "passwordAgain=" + passwordAgain : "") + "]";
	}

}
