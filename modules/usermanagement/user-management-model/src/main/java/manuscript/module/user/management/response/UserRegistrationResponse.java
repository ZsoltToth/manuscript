package manuscript.module.user.management.response;

public class UserRegistrationResponse extends BasicRespons {
	private boolean isSucces;

	public UserRegistrationResponse(boolean isSucces) {
		super();
		this.isSucces = isSucces;
	}

	public UserRegistrationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isSucces() {
		return isSucces;
	}

	public void setSucces(boolean isSucces) {
		this.isSucces = isSucces;
	}

}
