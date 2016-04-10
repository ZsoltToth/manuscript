package iit.uni.miskolc.user.registration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import iit.uni.miskolc.basic.response.MessageType;
import iit.uni.miskolc.basic.response.Messages;
import iit.uni.miskolc.user.exception.BusinessMessageAwareException;

/**
 * Define a new user in the system with ROLE_USER role. This user has
 * availability to modify own data only.
 * 
 * @author Balazs Kovacs
 *
 */
public class User {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Date birthDate;
	private String personalDescription;
//	private String role;
	private Date registrationDate;
	private UserAccessibility accessibility;
	
	private List<Messages> errorMessages = new ArrayList<Messages>();

	public List<Messages> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<Messages> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public User(){
		
	}
	
	public User(UserRegistrationRequest request){
		this.setFirstName(request.getFirstName());
		this.setLastName(request.getLastName());
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		try {
			throw new BusinessMessageAwareException("nullpointer exception volt");
		} catch (BusinessMessageAwareException e) {
			errorMessages.add(new Messages(MessageType.ERROR, e.getMessage()));
		}
//		this.setFirstName(firstName);
	}

	public String getLastName() {
		
		return lastName;
	}

	public void setLastName(String lastName){
		try {
			throw new BusinessMessageAwareException("nullpointer exception volt");
		} catch (BusinessMessageAwareException e) {
			errorMessages.add(new Messages(MessageType.ERROR, e.getMessage()));
		}
//		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
