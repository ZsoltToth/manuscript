package manuscript.module.user.management.personaldatasettings;

import manuscript.module.user.management.request.ChangePasswordRequest;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdateAcademicDisciplinesRequest;
import manuscript.module.user.management.response.ChangePasswordResponse;
import manuscript.module.user.management.response.PersonalDataSettingsPreloadResponse;
import manuscript.module.user.management.response.SavePersonalDataResponse;
import manuscript.module.user.management.response.UpdateAcademicDisciplinesResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface PersonalDataSettings {

	public PersonalDataSettingsPreloadResponse preload();

	public SavePersonalDataResponse savePersonalData(SavePersonalDataRequest request);
	
	public UpdateAcademicDisciplinesResponse updateAcademicDisciplines(UpdateAcademicDisciplinesRequest request);

	public ChangePasswordResponse changePassword(ChangePasswordRequest request);
}
