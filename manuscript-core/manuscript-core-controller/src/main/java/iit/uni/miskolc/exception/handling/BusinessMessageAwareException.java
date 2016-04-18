package iit.uni.miskolc.exception.handling;

public class BusinessMessageAwareException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessMessageAwareException() {
	}

	public BusinessMessageAwareException(String message) {
		super(message);
	}
	
	public BusinessMessageAwareException (String message, Throwable cause){
		super(message, cause);
	}
}
