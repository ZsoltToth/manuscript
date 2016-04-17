package iit.uni.miskolc.validator.basic;

public class Validator {
	
	protected Boolean isNull(String field) {
		if (field == null) {
			return true;
		}
		return false;
	}
}
