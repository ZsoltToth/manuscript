package manuscript.module.user.management.registration.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationMapper {

	/**
	 * Check the user name is reserved or not. If the result 0, the user name is not reserved.
	 * If the result 1 the user name is reserved already. 
	 * No other option because the user name in the database is unique.
	 * @return 0 or 1
	 */
	public int isUserNameReserved(@Param("userName") String userName);
}
