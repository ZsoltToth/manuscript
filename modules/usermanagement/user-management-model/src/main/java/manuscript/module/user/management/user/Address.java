package manuscript.module.user.management.user;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class Address {

	private String address;
	private String city;
	private String zipCode;
	private String country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String address, String city, String postal, String country) {
		super();
		this.address = address;
		this.city = city;
		this.zipCode = postal;
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return zipCode;
	}

	public void setPostal(String postal) {
		this.zipCode = postal;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
