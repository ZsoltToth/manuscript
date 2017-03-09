package manuscript.module.manuscript.management.exception;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UploadedFileEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public UploadedFileEmptyException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
