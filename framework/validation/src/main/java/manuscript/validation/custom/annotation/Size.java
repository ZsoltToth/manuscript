/**
 * 
 */
package manuscript.validation.custom.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import manuscript.validation.custom.annotation.constraint.SizeValidator;

/**
 * @author Balazs Kovacs
 *
 */

@Documented
@Constraint(validatedBy = { SizeValidator.class })
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface Size {
	static final int DEFAULT_MIN_SIZE = 0;
	static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
	
	String message() default "The size of the array should be between the given values!";
	
	int min() default DEFAULT_MIN_SIZE;
	
	int max() default DEFAULT_MAX_SIZE;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
