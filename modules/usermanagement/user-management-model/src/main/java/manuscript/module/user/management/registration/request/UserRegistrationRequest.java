package manuscript.module.user.management.registration.request;

import java.util.List;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.User;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationRequest {
	private User user;
	private List<AcademicDisciplines> academicDisciplines;
	private String passwordAgain;

	public UserRegistrationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationRequest(User user, List<AcademicDisciplines> academicDisciplines, String passwordAgaim) {
		super();
		this.user = user;
		this.academicDisciplines = academicDisciplines;
		this.passwordAgain = passwordAgaim;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<AcademicDisciplines> getAcademicDisciplines() {
		return academicDisciplines;
	}

	public void setAcademicDisciplines(List<AcademicDisciplines> academicDisciplines) {
		this.academicDisciplines = academicDisciplines;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

	@Override
	public String toString() {
		return "UserRegistrationRequest [" + (user != null ? "user=" + user + ", " : "")
				+ (academicDisciplines != null ? "academicDisciplines=" + academicDisciplines + ", " : "")
				+ (passwordAgain != null ? "passwordAgain=" + passwordAgain : "") + "]";
	}

}
