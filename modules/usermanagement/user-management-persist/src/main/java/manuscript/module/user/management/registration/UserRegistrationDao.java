package manuscript.module.user.management.registration;

import java.util.List;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.AdditionalData;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationDao {

	public boolean isNameReserved(String userName);

	public List<AcademicDisciplines> getAcademicDisciplines();

	public List<Role> getDefaultRole();

	public void createRegistration(UserRegistrationRequest request, AdditionalData additionalData);
}
