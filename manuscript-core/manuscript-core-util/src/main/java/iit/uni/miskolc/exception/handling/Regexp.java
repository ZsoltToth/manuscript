package iit.uni.miskolc.exception.handling;

/**
 * REGEXP
 * @author Balazs Kovacs
 *
 */
public class Regexp {
	
	public static final String NAME_VALIDATION_REGEXP = "[a-zA-ZöüóõúéáûíÖÜÓÕÚÛÁÉÍ]{1,20}"; //1-20ig helyes
	public static final String USER_NAME_VALIDATION_REGEXP = "[a-zA-Z\\d]{1,20}";
	/**
	 * Minimum 8 characters at least 1 Uppercase Alphabet, 1 Lowercase Alphabet, 1 Number and 1 Special Character:
	 */
	public static final String PASSWORD_REGEXP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}";
	public static final String EMAIL_VALIDATION_REGEXP = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
}
