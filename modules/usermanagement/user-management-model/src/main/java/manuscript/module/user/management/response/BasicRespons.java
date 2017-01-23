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
	List<Erros> errors;

	public void setFieldError(List<FieldError> fieldError) {

		if (errors == null) {
			errors = new ArrayList<Erros>();
		}

		Iterator<FieldError> iterator = fieldError.iterator();

		while (iterator.hasNext()) {
			FieldError error = iterator.next();
			Erros customError = new Erros();
			customError.setDefaultMessage(error.getDefaultMessage());
			customError.setField(error.getField());
			errors.add(customError);
		}
	}

	public List<Erros> getErrors() {
		return errors;
	}

	public void setErrors(List<Erros> errors) {
		this.errors = errors;
	}

}
