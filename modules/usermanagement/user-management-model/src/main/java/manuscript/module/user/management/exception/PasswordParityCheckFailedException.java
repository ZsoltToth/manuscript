package manuscript.module.user.management.exception;

public class PasswordParityCheckFailedException extends RuntimeException {
	private String errorMessage;

	public PasswordParityCheckFailedException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
