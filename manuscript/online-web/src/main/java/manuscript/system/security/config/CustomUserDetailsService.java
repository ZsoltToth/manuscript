package manuscript.system.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import manuscript.system.security.config.mapper.LoginMapper;

public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String userId = loadUserId(username);
		String password = loadPassword(userId);
		
		UserDetails user = new User(username, password, AuthorityUtils.createAuthorityList("ROLE_USER"));
        return user;
	}
	
	private String loadUserId(String username) {
		String userId = loginMapper.loadUserIdByUsername(username);
		
		if (userId == null) {
			throw new UsernameNotFoundException(userId + "not found.");
		}
		
		return userId;
	}
	
	private String loadPassword(String userId){
		return loginMapper.loadPasswordByUserId(userId);
	}
}
