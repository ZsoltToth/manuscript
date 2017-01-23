/**
 * 
 */
package manuscript.validation.custom.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import manuscript.validation.custom.annotation.constraint.LengthValidator;

/**
 * The annotated String size must be between the give size.
 * 
 * @author Balazs Kovacs
 *
 */

@Documented
@Constraint(validatedBy = { LengthValidator.class })
@Retention(RUNTIME)
@Target(FIELD)
public @interface Length {
	static final int DEFAULT_MIN_LENGTH = 0;
	static final int DEFAULT_MAX_LENGTH = Integer.MAX_VALUE;

	String message() default "The length of this field must be between {min} and {max}.";

	int min() default DEFAULT_MIN_LENGTH;

	int max() default DEFAULT_MAX_LENGTH;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
