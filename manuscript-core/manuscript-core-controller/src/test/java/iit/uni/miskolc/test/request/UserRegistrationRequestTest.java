package iit.uni.miskolc.test.request;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import iit.uni.miskolc.controller.request.UserRegistrationRequest;

public class UserRegistrationRequestTest {

	List<UserRegistrationRequest> requestTest = new ArrayList<UserRegistrationRequest>();
	UserRegistrationRequest request = new UserRegistrationRequest();
	
	{
		request.setFirstName(null);
		request.setLastName(null);
		requestTest.add(request);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = InvalidAttributesException.class)
	public void userRegistrationRequestIfNullMustReturnInvalidAttributesException() throws InvalidAttributesException {
		requestTest.get(0).createUser();
		fail("Must return InvalidAttributesException!");
	}

}
