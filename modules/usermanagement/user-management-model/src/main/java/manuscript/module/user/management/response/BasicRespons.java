package manuscript.module.user.management.response;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.validation.FieldError;

/**
 * 
 * @author bkovacs2
 *
 */
public class BasicRespons {
	private List<Error> errors;
	private String exceptionMessage;
	private String successMessage;

	public void setFieldError(List<FieldError> fieldError) {

		if (errors == null) {
			errors = new ArrayList<Error>();
		}

		Iterator<FieldError> iterator = fieldError.iterator();

		while (iterator.hasNext()) {
			FieldError error = iterator.next();
			Error customError = new Error();
			customError.setMessage(error.getDefaultMessage());
			customError.setField(error.getField());
			errors.add(customError);
		}
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

}
