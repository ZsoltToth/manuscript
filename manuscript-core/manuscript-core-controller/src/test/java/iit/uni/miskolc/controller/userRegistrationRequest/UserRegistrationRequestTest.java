package iit.uni.miskolc.controller.userRegistrationRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;

import iit.uni.miskolc.controller.request.UserRegistrationRequest;
import iit.uni.miskolc.model.address.Address;

public class UserRegistrationRequestTest {

	UserRegistrationRequest request;
	
	@Before
	public void setUp() throws Exception {
		request = new UserRegistrationRequest();
		request.setFirstName("Kiss");
		request.setLastName("Pista");
		request.setUserName("ASD123");
		request.setPassword("ASDeuhwefjd23!");
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = fmt.parse("2001-05-06");
		request.setBirthDate(date);
		request.setPersonalDescription("Description");
		request.setEmail("email@email.hu");
		request.setPhoneNumber("+36304545678");
		Address address = new Address();
		request.setAddress(address);
	}
	
//	@Test
//	public void createUserWithValidDatas() throws BusinessMessageAwareException{
//		request.createUser();
//	}
//	
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithWrongFirstName() throws BusinessMessageAwareException{
//		request.setFirstName("!");
//		request.createUser();
//	}
//	
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithWrongLastName() throws BusinessMessageAwareException{
//		request.setLastName("!");
//		request.createUser();
//	}
//	
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithWrongUserName() throws BusinessMessageAwareException{
//		request.setUserName("Ĺ�");
//		request.createUser();
//	}
//	
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithWrongPassword() throws BusinessMessageAwareException{
//		request.setPassword("wrongpassword");
//		request.createUser();
//	}
//
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithWrongDate() throws BusinessMessageAwareException{
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = null;
//		try {
//			date = fmt.parse("2019-05-06");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		request.setBirthDate(date);
//		request.createUser();
//	}
//	
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithTooLongDescription() throws BusinessMessageAwareException{
//		String longDescription = "";
//		for (int i = 0; i < 251; i++)
//			longDescription += "c";
//		request.setPersonalDescription(longDescription);
//		request.createUser();
//	}
//	
//	@Test (expected = BusinessMessageAwareException.class)
//	public void createUserWithWrongEmailAddress() throws BusinessMessageAwareException{
//		request.setEmail("email@gmail.hu.");
//		request.createUser();
//	}
	
}
