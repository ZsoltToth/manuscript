package manuscript.module.user.management.registration;

import java.util.List;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.AdditionalData;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.request.UserRegistrationRequest;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationDao {
	
	public final static String ACADEMIC_DISCIPLINES_CACHE = "manuscript.module.user.management.registration.getAcademicDisciplines";

	public boolean isNameReserved(String userName);

	public List<AcademicDisciplines> getAcademicDisciplines();

	public List<Role> getDefaultRole();

	public void createRegistration(UserRegistrationRequest request, AdditionalData additionalData);
}
