package manuscript.module.user.management.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import manuscript.module.user.management.exception.PasswordParityCheckFailedException;
import manuscript.module.user.management.exception.UserNameAlreadyUsedException;
import manuscript.module.user.management.response.BasicRespons;

@ControllerAdvice
public class UserRegistrationExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationExceptionHandler.class);

	@ExceptionHandler(UserNameAlreadyUsedException.class)
	@ResponseBody
	private BasicRespons userNameAlreadyUsedExceptionHandler(Exception exception) {
		BasicRespons response = new BasicRespons();

		response.setExceptionMessage(((UserNameAlreadyUsedException) exception).getErrorMessage());
		return response;
	}

	@ExceptionHandler(PasswordParityCheckFailedException.class)
	@ResponseBody
	private BasicRespons passwordParityCheckFailedExceptionHandler(Exception exception) {
		BasicRespons response = new BasicRespons();

		response.setExceptionMessage(((PasswordParityCheckFailedException) exception).getErrorMessage());
		return response;
	}
}
