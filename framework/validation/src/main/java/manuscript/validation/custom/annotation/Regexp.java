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

import manuscript.validation.custom.annotation.constraint.RegexpValidator;

/**
 * The annotated String need to fit the given regex pattern.
 * 
 * If you would like to write your own pattern use the pattern field only.
 * Otherwise chose a predefined pattern.
 * 
 * @author Balazs Kovacs
 *
 */

@Documented
@Constraint(validatedBy = { RegexpValidator.class })
@Retention(RUNTIME)
@Target(FIELD)
public @interface Regexp {
	static final String DEFAULT_PATTERN = ".*";

	String message() default "This field is not well-formed.";

	String pattern() default DEFAULT_PATTERN;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
