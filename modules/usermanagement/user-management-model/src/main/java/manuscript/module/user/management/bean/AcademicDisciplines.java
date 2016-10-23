package manuscript.module.user.management.bean;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class AcademicDisciplines {
	private String academicDisciplinesId;
	private String academicDisciplines;

	public AcademicDisciplines() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcademicDisciplines(String academicDisciplinesId, String academicDisciplines) {
		super();
		this.academicDisciplinesId = academicDisciplinesId;
		this.academicDisciplines = academicDisciplines;
	}

	public String getAcademicDisciplinesId() {
		return academicDisciplinesId;
	}

	public void setAcademicDisciplinesId(String academicDisciplinesId) {
		this.academicDisciplinesId = academicDisciplinesId;
	}

	public String getAcademicDisciplines() {
		return academicDisciplines;
	}

	public void setAcademicDisciplines(String academicDisciplines) {
		this.academicDisciplines = academicDisciplines;
	}

	@Override
	public String toString() {
		return "AcademicDisciplines ["
				+ (academicDisciplinesId != null ? "academicDisciplinesId=" + academicDisciplinesId + ", " : "")
				+ (academicDisciplines != null ? "academicDisciplines=" + academicDisciplines : "") + "]";
	}

}
