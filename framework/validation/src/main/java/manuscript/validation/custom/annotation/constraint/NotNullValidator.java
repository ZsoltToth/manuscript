package manuscript.validation.custom.annotation.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import manuscript.validation.custom.annotation.NotNull;

public class NotNullValidator implements ConstraintValidator<NotNull, Object> {

	@Override
	public void initialize(NotNull constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if (value == null) {
			return false;
		}
		return true;
	}

}
