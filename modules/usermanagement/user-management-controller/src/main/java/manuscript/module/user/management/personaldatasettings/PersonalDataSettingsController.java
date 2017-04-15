package manuscript.module.user.management.personaldatasettings;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import manuscript.module.user.management.request.ChangePasswordRequest;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdateAcademicDisciplinesRequest;
import manuscript.module.user.management.response.ChangePasswordResponse;
import manuscript.module.user.management.response.PersonalDataSettingsPreloadResponse;
import manuscript.module.user.management.response.SavePersonalDataResponse;
import manuscript.module.user.management.response.UpdateAcademicDisciplinesResponse;

@RestController
@RequestMapping("/personaldatasettings")
public class PersonalDataSettingsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalDataSettingsController.class);

	private PersonalDataSettings personalDataSettings;

	@Autowired
	public void setPersonalDataSettings(PersonalDataSettings personalDataSettings) {
		this.personalDataSettings = personalDataSettings;
	}

	@RequestMapping("/preload")
	public PersonalDataSettingsPreloadResponse preload() {
		return personalDataSettings.preload();
	}
	
	@RequestMapping("/savepersonaldata")
	public SavePersonalDataResponse savePersonalData(@RequestBody @Valid SavePersonalDataRequest request){
		return personalDataSettings.savePersonalData(request);
	}
	
	@RequestMapping("/updatedisciplines")
	public UpdateAcademicDisciplinesResponse updateAcademicDisciplines(@RequestBody @Valid UpdateAcademicDisciplinesRequest request){
		return personalDataSettings.updateAcademicDisciplines(request);
	}
	
	@RequestMapping("/changepassword")
	public ChangePasswordResponse changePassword(@RequestBody ChangePasswordRequest request){
		return personalDataSettings.changePassword(request);
	}
}
