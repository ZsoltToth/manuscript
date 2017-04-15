package manuscript.module.user.management.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import manuscript.module.user.management.bean.BasicResponse;
import manuscript.module.user.management.exception.GivenOldPasswordIsIncorrectException;
import manuscript.module.user.management.exception.PasswordParityCheckFailedException;
import manuscript.module.user.management.exception.UserNameAlreadyUsedException;

@ControllerAdvice
public class UserRegistrationExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationExceptionHandler.class);

	@ExceptionHandler(UserNameAlreadyUsedException.class)
	@ResponseBody
	private BasicResponse userNameAlreadyUsedExceptionHandler(Exception exception) {
		BasicResponse response = new BasicResponse();

		response.setExceptionMessage(((UserNameAlreadyUsedException) exception).getErrorMessage());
		return response;
	}

	@ExceptionHandler(PasswordParityCheckFailedException.class)
	@ResponseBody
	private BasicResponse passwordParityCheckFailedExceptionHandler(Exception exception) {
		BasicResponse response = new BasicResponse();

		response.setExceptionMessage(((PasswordParityCheckFailedException) exception).getErrorMessage());
		return response;
	}
	
	@ExceptionHandler(GivenOldPasswordIsIncorrectException.class)
	@ResponseBody
	private BasicResponse giveAllPasswordIsIncorrectException(GivenOldPasswordIsIncorrectException exception) {
//		BasicResponse response = new BasicResponse();
//
//		response.setExceptionMessage(exception.getErrorMessage());
		return getExceptionMessage(exception);
	}
	
	private BasicResponse getExceptionMessage(Exception exception){
		BasicResponse response = new BasicResponse();
		response.setExceptionMessage(exception.getMessage());
		return response;
	}
}
