package manuscript.system.security.config;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class AccessDeniedReply extends ReplyObject {

	private String defaultUrl;

	public String getDefaultUrl() {
		return defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}

}
