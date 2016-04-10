package iit.uni.miskolc.user.registration;

/**
 * Defines a new registered users address
 * 
 * @author Balazs Kovacs
 *
 */
public class UserAddress {
	private String address;
	private String city;
	private Integer postaCode;
	private String country;

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

	public Integer getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(Integer postaCode) {
		this.postaCode = postaCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
