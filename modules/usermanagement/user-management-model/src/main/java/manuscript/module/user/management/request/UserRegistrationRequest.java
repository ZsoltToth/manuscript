package manuscript.module.user.management.request;

import java.util.List;

import javax.validation.Valid;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.Password;
import manuscript.module.user.management.bean.User;
import manuscript.validation.custom.annotation.Size;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationRequest {

	@Valid
	private User user;

	@Valid
	private Password password;

	@Size(min = 1, message = "Please select one or more disciplines!")
	private List<AcademicDisciplines> academicDisciplines;

	public UserRegistrationRequest(User user, Password password, List<AcademicDisciplines> academicDisciplines) {
		super();
		this.user = user;
		this.password = password;
		this.academicDisciplines = academicDisciplines;
	}

	public UserRegistrationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public List<AcademicDisciplines> getAcademicDisciplines() {
		return academicDisciplines;
	}

	public void setAcademicDisciplines(List<AcademicDisciplines> academicDisciplines) {
		this.academicDisciplines = academicDisciplines;
	}

}
