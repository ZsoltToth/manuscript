package iit.uni.miskolc.exception.handling;

import java.util.List;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserValidationException extends Exception {

	private static final long serialVersionUID = 1L;
	private List<Exception> exception;

	public List<Exception> getException() {
		return exception;
	}

	public void setException(final List<Exception> exception) {
		this.exception = exception;
	}

	public UserValidationException(final List<Exception> exception) {
		super();
		setException(exception);
	}

}
