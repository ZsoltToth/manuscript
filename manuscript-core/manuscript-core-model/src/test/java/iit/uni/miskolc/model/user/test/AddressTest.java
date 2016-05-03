package iit.uni.miskolc.model.user.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import iit.uni.miskolc.exception.handling.AddressValidationException;
import iit.uni.miskolc.exception.handling.UserValidationException;
import iit.uni.miskolc.model.address.Address;

public class AddressTest{
	Address address;
	
	@Before
	public void setUp(){
		address = new Address();
		address.setStreet("Egyetem út");
		address.setCity("Miskolc");
		address.setPostaCode("3525");
		address.setCountry("Magyarország");
	}
	
	@Ignore		//@Test (expected = IllegalArgumentException.class)
	public void setTooLongCityMustThrowIllegalArgumentException(){
		String a = "";
		for (int i=0; i<51; i++)
			a += "a";
		address.setCity(a);	
	}
	
	@Ignore 	//@Test (expected = IllegalArgumentException.class)
	public void setTooLongCountryMustThrowIllegalArgumentException(){
		String a = "";
		for (int i=0; i<51; i++)
			a += "a";
		address.setCountry(a);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void setTooLongStreetMustThrowIllegalArgumentException(){
		String a = "";
		for (int i=0; i<81; i++)
			a += "a";
		address.setStreet(a);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setNullCityMusThrowIllegalArgumentException(){
		address.setCity(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void setWrongPostalCodeMustThrowIllegalArgumentException(){
		address.setPostaCode("3515!");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setNullCountryMusThrowIllegalArgumentException(){
		address.setCountry(null);
	}
	
	@Test
	public void testConstructor() throws UserValidationException, AddressValidationException{
		address = new Address("Egyetem út","Miskolc","3525","Magyarország");
	}
	
	@Test (expected = AddressValidationException.class)
	public void testWrongConstructor() throws UserValidationException, AddressValidationException{
		address = new Address(null,"Miskolc","3525","Magyarország");
	}
}
