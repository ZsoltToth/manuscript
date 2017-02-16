package manuscript.module.user.management.response;

public class UserRegistrationResponse extends BasicRespons {
	private boolean isSuccess;

	public UserRegistrationResponse(boolean isSuccess) {
		super();
		this.isSuccess = isSuccess;
	}

	public UserRegistrationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSucces) {
		this.isSuccess = isSucces;
	}

}
