package manuscript.module.user.management.registration;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.exception.UserNameAlreadyUsedException;
import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationPreloadResponse;
import manuscript.module.user.management.response.UserRegistrationResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserRegistrationServiceContext.class)
public class UserRegistrationServiceTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(UserRegistrationServiceTest.class);

	@Autowired
	private UserRegistrationDao userRegistrationDao;

	@Autowired
	private UserRegistrationService userRegistrationService;

	private static List<AcademicDisciplines> academicDisciplines;

	@BeforeClass
	public static void init() {
		academicDisciplines = new ArrayList<AcademicDisciplines>();
	}
	
	@Before
	public void reset(){
		EasyMock.reset(userRegistrationDao);
	}

	@Test
	public void test1() {
		
		EasyMock.expect(userRegistrationDao.getAcademicDisciplines()).andReturn(academicDisciplines);
		EasyMock.replay(userRegistrationDao);

		UserRegistrationPreloadResponse preloadResponse = userRegistrationService.userRegistrationPreload();

		Assert.assertNotNull(preloadResponse);
	}

	@Test
	public void buzi() {

		EasyMock.expect(userRegistrationDao.isNameReserved("Béla")).andReturn(true);
		EasyMock.replay(userRegistrationDao);
		try {
			UserRegistrationRequest req = new UserRegistrationRequest();
			User user = new User();
			user.setUserName("Béla");
			req.setUser(user);
			
			UserRegistrationResponse userRegistrationResponse = userRegistrationService.createRegistration(req);
		} catch (UserNameAlreadyUsedException e) {
			LOGGER.error(e.getMessage());
			return;
		}
		Assert.fail("buzi");

	}

}
