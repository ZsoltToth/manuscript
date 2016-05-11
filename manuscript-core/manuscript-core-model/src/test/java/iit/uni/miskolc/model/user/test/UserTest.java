package iit.uni.miskolc.model.user.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.junit.*;

import iit.uni.miskolc.exception.handling.AddressValidationException;
import iit.uni.miskolc.exception.handling.UserValidationException;
import iit.uni.miskolc.model.address.Address;
import iit.uni.miskolc.model.user.User;

public class UserTest {

	User user;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void setFirstNameMustThrowIllegalArgumentExceptionIfTheNameIsNull() throws UserValidationException {
		user = new User();
		user.setFirstName(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void setFirstNameMustThrowIllegalArgumentExceptionIfTheNameIsNotMatchThePattern()
			throws UserValidationException {
		user = new User();
		user.setFirstName("first name");
	}

	@Test
	public void initUserWithValidDatas() throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithWrongFirstNameThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("wong name", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithWrongLastNameThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "wrong name", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithWrongUserNameThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "wrong name", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithPasswordThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "wrong name", "ASDqweRT34", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithWrongDateThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2018-05-06");

		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithWrongDescriptionThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		String longDescription = "";
		for (int i = 0; i < 251; i++) {
			longDescription += "a";
		}
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, longDescription, "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithNullFirstNameThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User(null, "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu", "+3630/7896783",
				new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithNullLastNameThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", null, "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu", "+3630/7896783",
				new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithNullUserNameThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", null, "ASDqweRT34!", date, "description", "email@gmail.hu", "+3630/7896783",
				new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithNullPasswordThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", null, date, "description", "email@gmail.hu", "+3630/7896783",
				new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithNullBirthDateThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		Date date = null;
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithNullPersonalDescriptionThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, null, "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}
	
	@Test(expected = UserValidationException.class)
	public void initUserWithNullPhoneNumberThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				null, new Address("street", "city", "1355", "country"));
	}
	
	@Test(expected = Exception.class)
	public void initUserWithNullAddressThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", null);
	}
	
	@Test(expected = UserValidationException.class)
	public void initUserWithNullEmailThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", null,
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}

	@Test(expected = UserValidationException.class)
	public void initUserWithWrongEmailThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");

		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "emailgmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
	}
	
	@Test(expected = UserValidationException.class)
	public void initUserWithWrongPhoneNumberThrowsUserValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");

		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+36307896783", new Address("street", "city", "1355", "country"));
	}
	
	@Test(expected = AddressValidationException.class)
	public void initUserWithWrongStreetThrowsAddressValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		String temp = "a";
		for (int i=0; i<80; i++){
			temp += "a";
		}
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+36/307896783", new Address(temp, "city", "1355", "country"));
	}
	
	@Test(expected = AddressValidationException.class)
	public void initUserWithWrongPostCodeThrowsAddressValidationException()
			throws UserValidationException, AddressValidationException, ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");

		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+36/307896783", new Address("street", "city", "1355a", "country"));
	}
	
	@Test
	public void getFirstNameTest() {
		user = new User();
		user.setFirstName("Pista");
		assertEquals(user.getFirstName(), "Pista");
	}

	@Test
	public void getLastNameTest() {
		user = new User();
		user.setLastName("Kiss");
		assertEquals(user.getLastName(), "Kiss");
	}

	@Test
	public void getUserNameTest() {
		user = new User();
		user.setUserName("Pista");
		assertEquals(user.getUserName(), "Pista");
	}

	@Test
	public void getEmailTest() {
		user = new User();
		user.setEmail("asd@gmail.com");
		assertEquals(user.getEmail(), "asd@gmail.com");
	}

	@Test
	public void getPasswordTest() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user = new User();
		user.setPassword("QWErtzQ57!");
		assertFalse(user.getPassword().equals(passwordEncoder.encode("QWErtzQ57!")));
	}

	@Test
	public void getBirthDateTest() throws ParseException {
		user = new User();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user.setBirthDate(date);
		assertEquals(user.getBirthDate(), date);
	}

	@Test
	public void getPersonalDescriptionTest() {
		user = new User();
		user.setPersonalDescription("description");
		assertEquals(user.getPersonalDescription(), "description");
	}

	@Test
	public void getRegistrationDate() throws ParseException {
		user = new User();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user.setRegistrationDate(date);
		;
		assertEquals(user.getRegistrationDate(), date);
	}

	@Test
	public void getPhoneNumberTest() {
		user = new User();
		user.setPhoneNumber("+36-30/4567891");
		assertEquals(user.getPhoneNumber(), "+36-30/4567891");
	}

	@Test
	public void toStringMethodTest() throws ParseException, UserValidationException, AddressValidationException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		date = fmt.parse("2001-05-06");
		user = new User("Kiss", "Pista", "Pista12", "ASDqweRT34!", date, "description", "email@gmail.hu",
				"+3630/7896783", new Address("street", "city", "1355", "country"));
		System.out.println(user.toString());
	}

}
