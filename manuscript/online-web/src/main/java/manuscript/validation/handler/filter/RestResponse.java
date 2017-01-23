package manuscript.validation.handler.filter;

/**
 * 
 * 
 * @author bkovacs2
 *
 */
public class RestResponse {

	private boolean success = true;
	private Object data;

	public RestResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestResponse(boolean success, Object data) {
		super();
		this.success = success;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
