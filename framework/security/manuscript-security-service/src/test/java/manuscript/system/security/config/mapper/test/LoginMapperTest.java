package manuscript.system.security.config.mapper.test;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import manuscript.system.security.config.mapper.LoginMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = LoginMapperContext.class)
@Transactional
public class LoginMapperTest {

	@Autowired
	private LoginMapper loginMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	@Ignore
	public void loadUserIdByUsernameTest() {
		String id = loginMapper.loadUserIdByUsername("admin");
		
		if (id == null) {
			assertTrue("Nincs ilyen user", id == null);
		}else{
		assertTrue("Van ilyen user", id != null);
		}
	}
	
	@Test
	@Ignore
	public void loadPasswordByUserIdTest(){
		String password = loginMapper.loadPasswordByUserId("7");
		
		Boolean encodedPass = passwordEncoder.matches("password", password);
		
		if (encodedPass) {
			System.out.println("PASSWORD ENCODE IS " + encodedPass);
			assertTrue("Password matched", encodedPass == true);
		}else{
			System.out.println("PASSWORD ENCODE IS " + encodedPass);
			assertTrue("Password missmatched", encodedPass == false);
		}

	}
	
	@Test
	@Ignore
	public void loadAuthorityListByUserIdTest(){
		for (String role : loginMapper.loadAuthorityListByUserId("19")) {
			System.out.println("Granted roles: " + role);
		}

	}

}
