package manuscript.validation.custom.annotation.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import manuscript.validation.custom.annotation.Length;

/**
 * Validate that the give String is between the min and max values.
 * 
 * @author Balazs Kovacs
 *
 */
public class LengthValidator implements ConstraintValidator<Length, String> {
	private int minLength;
	private int maxLength;

	@Override
	public void initialize(Length parameters) {
		minLength = parameters.min();
		maxLength = parameters.max();

		parameterValidation();

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value == null || (value.length() >= minLength && value.length() < maxLength) ? true : false;
	}

	private void parameterValidation() {
		if (minLength < Length.DEFAULT_MIN_LENGTH) {
			throw new IllegalArgumentException("The minimum parameter cannot be negative!");
		}
		if (maxLength < Length.DEFAULT_MIN_LENGTH) {
			throw new IllegalArgumentException("The maximum parameter cannot be negative!");
		}
		if (maxLength < minLength) {
			throw new IllegalArgumentException("The maximum parameter cannot be bigger then the minimum parameter and vice versa!");
		}
	}

}
