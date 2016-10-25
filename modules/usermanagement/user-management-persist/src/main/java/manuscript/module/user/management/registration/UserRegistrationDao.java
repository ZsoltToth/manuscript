package manuscript.module.user.management.registration;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationDao {
	
	public boolean isNameReserved(String userName);
	
	
}
