/**
 * 
 */
package manuscript.validation.custom.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import manuscript.validation.custom.annotation.constraint.NotNullValidator;

/**
 * The annotated Object must not be null. Accept any type.
 * 
 * @author Balazs Kovacs
 *
 */

@Documented
@Constraint(validatedBy = { NotNullValidator.class })
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface NotNull {

	String message() default "The field is required.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
