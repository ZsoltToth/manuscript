package manuscript.validation.custom.annotation.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import manuscript.validation.custom.annotation.NotNull;

/**
 * Validate that the given object is not null.
 * 
 * @author Balazs Kovacs
 *
 */
public class NotNullValidator implements ConstraintValidator<NotNull, Object> {

	@Override
	public void initialize(NotNull constraintAnnotation) {

	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		return value != null && !String.valueOf(value).equals("") ? true : false;
	}

}
