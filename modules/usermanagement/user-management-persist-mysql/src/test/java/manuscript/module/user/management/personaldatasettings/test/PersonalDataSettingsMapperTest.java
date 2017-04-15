package manuscript.module.user.management.personaldatasettings.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.personaldatasettings.PersonalDataSettingsDao;
import manuscript.module.user.management.request.SavePersonalDataRequest;
import manuscript.module.user.management.request.UpdateAcademicDisciplinesRequest;
import manuscript.module.user.management.request.UpdatePassword;
import manuscript.system.security.bean.AuthenticatedUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = PersonalDataSettingsMapperContext.class)
@Transactional
public class PersonalDataSettingsMapperTest {

	@Autowired
	private PersonalDataSettingsDao personalDataSettingsDao;

	private static List<AcademicDisciplines> academicDisciplines;
	private static AuthenticatedUser authenticatedUser;
	private static AuthenticatedUser notPresentUser;
	private static SavePersonalDataRequest savePersonalDataRequest;
	private static UpdatePassword updatePassword;
	private static AcademicDisciplines disciplines;

	@BeforeClass
	public static void init() {
		academicDisciplines = new ArrayList<AcademicDisciplines>();
		authenticatedUser = new AuthenticatedUser("jon", "", "4", getAuthority());
		notPresentUser = new AuthenticatedUser("jon", "", "0", getAuthority());
		savePersonalDataRequest = new SavePersonalDataRequest();
		savePersonalDataRequest.setTitle("Mr");
		savePersonalDataRequest.setEmail("test@mail.com");
		savePersonalDataRequest.setFirstName("Teszt");
		savePersonalDataRequest.setLastName("Elek");
		savePersonalDataRequest.setJob("Nothing");
		updatePassword = new UpdatePassword();
		updatePassword.setEncryptedPassword("$2a$10$je.uoPgUafFeX.Houh2/W.2vM4z70z5oy2fw7qbfh2hA1Dj74t8Ai");
		updatePassword.setUserId(authenticatedUser.getUserId());
		disciplines = new AcademicDisciplines();
		disciplines.setAcademicDisciplinesId("01001");
	}

	private static List<GrantedAuthority> getAuthority() {
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("DUMMY");
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(simpleGrantedAuthority);
		return authorities;
	}

	@Test
	public void getUserDataTest() {
		User user = personalDataSettingsDao.getUserData(authenticatedUser);
		Assert.assertNotNull(user);
	}

	@Test
	public void getUserDataTestWithNoResult() {
		User user = personalDataSettingsDao.getUserData(notPresentUser);
		Assert.assertNull(user);
	}

	@Test
	public void getAcademicDisciplinesWithResult() {
		academicDisciplines = personalDataSettingsDao.getAcademicDisciplinesByUserId("4");
		Assert.assertTrue(academicDisciplines.size() > 0);
	}

	@Test
	public void updatePersonalData() {
		personalDataSettingsDao.updatePersonalData(savePersonalDataRequest, "1");
	}

	@Test
	public void getPasswordByUserId() {
		String password = personalDataSettingsDao.getPasswordByUserId(authenticatedUser.getUserId());
		Assert.assertNotNull(password);
	}

	@Test
	public void getPasswordByUserIdWithoutResult() {
		String password = personalDataSettingsDao.getPasswordByUserId(notPresentUser.getUserId());
		Assert.assertNull(password);
	}

	@Test
	public void updatePasswordByUserId() {
		personalDataSettingsDao.updatePassword(updatePassword);
	}

	@Test
	public void removeAcademicDisciplinesByUserId() {
		UpdateAcademicDisciplinesRequest request = new UpdateAcademicDisciplinesRequest();
		academicDisciplines.clear();
		academicDisciplines.add(disciplines);
		request.setAcademicDisciplines(academicDisciplines);
		personalDataSettingsDao.updateAcademicDisciplinesByUserId(request, authenticatedUser.getUserId());
	}
}
