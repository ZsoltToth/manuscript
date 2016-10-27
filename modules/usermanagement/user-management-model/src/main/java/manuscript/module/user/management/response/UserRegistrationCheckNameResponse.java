package manuscript.module.user.management.response;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationCheckNameResponse {
	private boolean isUsed;

	public UserRegistrationCheckNameResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationCheckNameResponse(boolean isUsed) {
		super();
		this.isUsed = isUsed;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "UserRegistrationCheckNameResponse [isUsed=" + isUsed + "]";
	}

}
