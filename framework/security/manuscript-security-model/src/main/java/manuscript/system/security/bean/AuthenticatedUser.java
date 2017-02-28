package manuscript.system.security.bean;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * You can use this object to get the authenticated user object. <b>Example:</b>
 * 
 * <pre>
 * {@code AuthenticatedUser userDetails = (AuthenticatedUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();}
 * <pre>
 * 
 * @author Balazs Kovacs
 *
 */
public class AuthenticatedUser extends User {

	private static final long serialVersionUID = 1L;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AuthenticatedUser(String username, String password, String userId,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		this.userId = userId;
	}

}
