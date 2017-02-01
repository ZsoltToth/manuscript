package manuscript.validation.custom.annotation.constraint;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import manuscript.validation.custom.annotation.Size;

public class SizeValidator implements ConstraintValidator<Size, List> {
	private int minSize;
	private int maxSize;

	@Override
	public void initialize(Size constraintAnnotation) {
		minSize = constraintAnnotation.min();
		maxSize = constraintAnnotation.max();

		parameterValidation();
	}

	@Override
	public boolean isValid(List value, ConstraintValidatorContext context) {
		return value == null || (value.size() >= minSize && value.size() < maxSize) ? true : false;
	}

	private void parameterValidation() {
		if (minSize < Size.DEFAULT_MIN_SIZE) {
			throw new IllegalArgumentException("The minimum parameter cannot be negative!");
		}
		if (maxSize < Size.DEFAULT_MIN_SIZE) {
			throw new IllegalArgumentException("The maximum parameter cannot be negative!");
		}
		if (maxSize < minSize) {
			throw new IllegalArgumentException(
					"The maximum parameter cannot be bigger then the minimum parameter and vice versa!");
		}
	}
}
