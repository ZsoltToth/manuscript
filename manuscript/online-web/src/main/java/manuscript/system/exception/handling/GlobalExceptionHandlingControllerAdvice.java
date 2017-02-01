package manuscript.system.exception.handling;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlingControllerAdvice {

	private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandlingControllerAdvice.class);

	public GlobalExceptionHandlingControllerAdvice() {
	}

//	@ExceptionHandler(RuntimeException.class)
//	public void handleRuntimeException(HttpServletRequest req, Exception exception) {
//		LOGGER.error("Request raised a Exception");
//	}

}
