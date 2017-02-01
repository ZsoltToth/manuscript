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
	private List<Errors> errors;
	private String exceptionMessage;

	public void setFieldError(List<FieldError> fieldError) {

		if (errors == null) {
			errors = new ArrayList<Errors>();
		}

		Iterator<FieldError> iterator = fieldError.iterator();

		while (iterator.hasNext()) {
			FieldError error = iterator.next();
			Errors customError = new Errors();
			customError.setDefaultMessage(error.getDefaultMessage());
			customError.setField(error.getField());
			errors.add(customError);
		}
	}

	public List<Errors> getErrors() {
		return errors;
	}

	public void setErrors(List<Errors> errors) {
		this.errors = errors;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
