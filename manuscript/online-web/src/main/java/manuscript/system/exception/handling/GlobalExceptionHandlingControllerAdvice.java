package manuscript.system.exception.handling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@ControllerAdvice
public class GlobalExceptionHandlingControllerAdvice {

	private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandlingControllerAdvice.class);

	public GlobalExceptionHandlingControllerAdvice() {
	}

	// @ExceptionHandler(RuntimeException.class)
	// public void handleRuntimeException(HttpServletRequest req, Exception
	// exception) {
	// LOGGER.error("Request raised a Exception");
	// }

}
