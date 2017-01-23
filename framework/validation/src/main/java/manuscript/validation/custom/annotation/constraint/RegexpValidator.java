package manuscript.validation.custom.annotation.constraint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import manuscript.validation.custom.annotation.Regexp;

/**
 * Validate that the given String is match the pattern.
 * 
 * @author Balazs Kovacs
 *
 */
public class RegexpValidator implements ConstraintValidator<Regexp, String> {

	// @Autowired
	// @Qualifier(value = "defaultEmailRegex")
	// private String defaultEmailPatter;
	private Pattern pattern;

	@Override
	public void initialize(Regexp parameters) {
		try {
			pattern = Pattern.compile(parameters.pattern());
		} catch (PatternSyntaxException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Matcher matcher = pattern.matcher(value);
		return value == null || matcher.matches() ? true : false;
	}
}
