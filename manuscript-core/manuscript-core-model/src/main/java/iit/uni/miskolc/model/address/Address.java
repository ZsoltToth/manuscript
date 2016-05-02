package iit.uni.miskolc.model.address;

import java.util.ArrayList;
import java.util.List;

import iit.uni.miskolc.exception.handling.AddressValidationException;
import iit.uni.miskolc.exception.handling.Regexp;
import iit.uni.miskolc.exception.handling.UserValidationException;

/**
 * Defines a new registered users address
 * 
 * @author Balazs Kovacs
 *
 */
public class Address {
	private String street;
	private String city;
	private String postalCode;
	private String country;

	public Address() {
	}

	public Address(String street, String city, String postaCode, String country) throws UserValidationException, AddressValidationException {
		List<Exception> exceptions = new ArrayList<Exception>();

		try {
			setStreet(street);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		try {
			setCity(city);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		try {
			setPostaCode(postaCode);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		try {
			setCountry(country);
		} catch (Exception e) {
			e.printStackTrace();
			exceptions.add(e);
		}

		if (!exceptions.isEmpty()) {
			throw new AddressValidationException(exceptions);
		}

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		if (street == null) {
			throw new IllegalArgumentException("Street is required!");
		} else if (street.length() > 80) {
			throw new IllegalArgumentException("Street must shorter then 80 characters!");
		}
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if (city == null) {
			throw new IllegalArgumentException("City is required!");
		}
		this.city = city;
	}

	public String getPostaCode() {
		return postalCode;
	}

	public void setPostaCode(String postaCode) {
		if (postaCode == null) {
			throw new IllegalArgumentException("Postal code is required!");
		} else if (!postaCode.matches(Regexp.POSTAL_CODE_VALIDATION_REGEXP)) {
			throw new IllegalArgumentException("Wrong postal code!");
		}
		this.postalCode = postaCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		if (country == null) {
			throw new IllegalArgumentException("Country is required");
		}
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postalCode=" + postalCode + ", country=" + country
				+ "]";
	}

}
