package iit.uni.miskolc.model.user.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import iit.uni.miskolc.exception.handling.AddressValidationException;
import iit.uni.miskolc.exception.handling.UserValidationException;
import iit.uni.miskolc.model.address.Address;
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
	
		
	@Test
	public void initUserWithValidDatas() throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss","Pista","Pista12","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}

	@Test (expected = UserValidationException.class)
	public void initUserWithWrongFirstNameThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("wong name","Pista","Pista12","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}
	
	@Test (expected = UserValidationException.class)
	public void initUserWithWrongLastNameThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss","wrong name","Pista12","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}

	
	@Test (expected = UserValidationException.class)
	public void initUserWithWrongUserNameThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss","Pista","wrong name","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}
	
	@Test (expected = UserValidationException.class)
	public void initUserWithPasswordThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss","Pista","wrong name","ASDqweRT34",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}

	
	@Test (expected = UserValidationException.class)
	public void initUserWithWrongDateThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2023-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss","Pista","Pista12","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}
	
	@Test (expected = UserValidationException.class)
	public void initUserWithWrongDescriptionThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String longDescription = "";
		for(int i=0; i<251; i++){
			longDescription += "a";
		}
		user = new User("Kiss","Pista","Pista12","ASDqweRT34!",date,longDescription,"email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}
	
	
	@Test (expected = UserValidationException.class)
	public void initUserWithNullFirstNameThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User(null,"Pista","Pista12","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}

	@Test (expected = UserValidationException.class)
	public void initUserWithNullLastNameThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss",null,"Pista12","ASDqweRT34!",date,"description","email@gmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}
	
	@Test (expected = UserValidationException.class)
	public void initUserWithWrongEmailThrowsUserValidationException () throws UserValidationException, AddressValidationException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse("2001-05-06");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user = new User("Kiss","Pista","Pista12","ASDqweRT34!",date,"description","emailgmail.hu","+3630/7896783",new Address("street", "city", "1355", "country"));
	}

}
