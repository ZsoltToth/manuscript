package iit.uni.miskolc.exception.handling;

import java.util.List;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class BusinessMessageAwareException extends Exception {

	private static final long serialVersionUID = 1L;

	private List<Exception> exc;

	public void setExceptions(final List<Exception> exc) {
		this.exc = exc;
	}

	public List<Exception> getException() {
		return exc;
	}

	public BusinessMessageAwareException() {
	}

	public BusinessMessageAwareException(String message) {
		super(message);
	}

	public BusinessMessageAwareException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessMessageAwareException(List<Exception> exc) {
		super();
		setExceptions(exc);
	}
}
