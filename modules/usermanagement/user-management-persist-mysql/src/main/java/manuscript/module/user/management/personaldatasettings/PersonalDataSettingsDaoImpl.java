package manuscript.module.user.management.personaldatasettings;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.personaldatasettings.mapper.PersonalDataSettingsMapper;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdateAcademicDisciplinesRequest;
import manuscript.module.user.management.request.UpdatePassword;
import manuscript.system.security.bean.AuthenticatedUser;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Repository
public class PersonalDataSettingsDaoImpl implements PersonalDataSettingsDao {

	private PersonalDataSettingsMapper personalDataSettingsMapper;

	public PersonalDataSettingsDaoImpl(PersonalDataSettingsMapper personalDataSettingsMapper) {
		this.personalDataSettingsMapper = personalDataSettingsMapper;
	}

	@Override
	public User getUserData(AuthenticatedUser authenticatedUser) {
		return personalDataSettingsMapper.getUserData(authenticatedUser.getUserId());
	}

	@Override
	public List<AcademicDisciplines> getAcademicDisciplinesByUserId(String userId) {
		return personalDataSettingsMapper.getAcademicDisciplinesById(userId);
	}

	@Override
	public void updatePersonalData(SavePersonalDataRequest request, String userId) {
		personalDataSettingsMapper.updatePersonalData(request, userId);
	}

	@Override
	public String getPasswordByUserId(String userId) {
		return personalDataSettingsMapper.getPasswordByUserId(userId);
	}

	@Override
	public void updatePassword(UpdatePassword updatePassword) {
		personalDataSettingsMapper.updatePasswordByUserId(updatePassword);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateAcademicDisciplinesByUserId(UpdateAcademicDisciplinesRequest academicDisciplinesRequest,
			String userId) {
		personalDataSettingsMapper.removeAcademicDisciplinesByUserId(userId);
		personalDataSettingsMapper.insertAcademicDisciplinesByUserId(academicDisciplinesRequest.getAcademicDisciplines(), userId);
	}

}
