package manuscript.module.user.management.personaldatasettings.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdatePassword;

public interface PersonalDataSettingsMapper {

	public User getUserData(@Param("userId") String userId);

	public List<AcademicDisciplines> getAcademicDisciplinesById(@Param("userId") String userId);

	public void updatePersonalData(@Param("personalData") SavePersonalDataRequest request,
			@Param("userId") String userId);

	public String getPasswordByUserId(@Param("userId") String userId);

	public void updatePasswordByUserId(@Param("password") UpdatePassword updatePassword);

	public void removeAcademicDisciplinesByUserId(@Param("userId") String userId);

	public void insertAcademicDisciplinesByUserId(
			@Param("disciplines") List<AcademicDisciplines> academicDisciplines,
			@Param("userId") String userId);
}
