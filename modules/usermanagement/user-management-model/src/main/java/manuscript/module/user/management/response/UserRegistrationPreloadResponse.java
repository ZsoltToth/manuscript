package manuscript.module.user.management.response;

import java.util.List;

import manuscript.module.user.management.bean.AcademicDisciplines;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationPreloadResponse {
	private List<AcademicDisciplines> academicDisciplines;

	public UserRegistrationPreloadResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationPreloadResponse(List<AcademicDisciplines> academicDisciplines) {
		super();
		this.academicDisciplines = academicDisciplines;
	}

	public List<AcademicDisciplines> getAcademicDisciplines() {
		return academicDisciplines;
	}

	public void setAcademicDisciplines(List<AcademicDisciplines> academicDisciplines) {
		this.academicDisciplines = academicDisciplines;
	}

	@Override
	public String toString() {
		return "UserRegistrationPreloadResponse ["
				+ (academicDisciplines != null ? "academicDisciplines=" + academicDisciplines : "") + "]";
	}

}
