package manuscript.module.user.management.registration.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.Password;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.bean.User;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationMapper {

	/**
	 * Check the user name is reserved or not. If the result 0, the user name is
	 * not reserved. If the result 1 the user name is reserved already. No other
	 * option because the user name in the database is unique.
	 * 
	 * @return 0 or 1
	 */
	public int isUserNameReserved(@Param("userName") String userName);

	/**
	 * Get all academic disciplines what is currently available in the database.
	 * Under the registration process the customer is able to choose about the
	 * result of the select query only.
	 * 
	 * @return List of the disciplines
	 */
	public List<AcademicDisciplines> getAcademicDisciplines();

	public List<Role> getDefaultRoles();

	/**
	 * Insert the give user name into the database. If the user name is already
	 * exist, DuplicateKeyException will be throw.
	 * 
	 * @param userId
	 * @param userName
	 */
	public void insertUserAlias(@Param("userName") String userName);

	public void insertUser(@Param("user") User user, @Param("userId") int userId);

	public void insertPassword(@Param("password") Password password, @Param("userId") int userId);

	public void insertLogin(@Param("userName") String userName, @Param("passwordId") int passwordId);

	public void insertUserRoles(@Param("roles") List<Role> defaultRoles, @Param("userId") int userId);

	public int getUserId(@Param("userName") String userName);

	public int getPasswordId(@Param("userId") int userId);

	public void insertAcadamicDisciplines(@Param("academicDisciplines")List<AcademicDisciplines> academicDisciplines,@Param("userId") int userId);
}
