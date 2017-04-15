package manuscript.module.user.management.exception;

public class UserNameAlreadyUsedException extends RuntimeException {
	private String errorMessage;

	public UserNameAlreadyUsedException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
