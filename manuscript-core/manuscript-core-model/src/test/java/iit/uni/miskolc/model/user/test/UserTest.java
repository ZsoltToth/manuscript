package iit.uni.miskolc.model.user.test;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import iit.uni.miskolc.exception.handling.UserValidationException;
import iit.uni.miskolc.model.user.User;

public class UserTest {

	User user;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test (expected = IllegalArgumentException.class)
	public void setFirstNameMustThrowIllegalArgumentExceptionIfTheNameIsNull() throws UserValidationException {
		user = new User();
		user.setFirstName(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void setFirstNameMustThrowIllegalArgumentExceptionIfTheNameIsNotMatchThePattern() throws UserValidationException {
		user = new User();
		user.setFirstName("first name");
	}

}
