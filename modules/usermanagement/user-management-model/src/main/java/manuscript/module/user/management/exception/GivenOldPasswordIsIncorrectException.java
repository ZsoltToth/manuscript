package manuscript.module.user.management.exception;

public class GivenOldPasswordIsIncorrectException extends RuntimeException {

	private String errorMessage;

	public GivenOldPasswordIsIncorrectException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return errorMessage;
	}
}
