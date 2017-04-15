package manuscript.module.user.management.registration.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.Password;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.bean.User;
import manuscript.module.user.management.registration.mapper.UserRegistrationMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = UserRegistrationDaoContext.class)
@Transactional
//@Ignore
public class UserRegistrationDaoTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationDaoTest.class);

	@Autowired
	private UserRegistrationMapper userRegistrationMapper;
	private static User user = new User();
	private static Password password = new Password();
	private static List<Role> roleList = new ArrayList<Role>();
	private static List<AcademicDisciplines> academicDisciplines = new ArrayList<AcademicDisciplines>();

	static {

		user.setTitle("Mr");
		user.setFirstName("John");
		user.setLastName("Snow");
		user.setUserName("john_snow");
		user.setEmail("john.snow@email.com");
		user.setJob("Lord Commander of the Night's Watch");

		password.setPassword("password");

		roleList.add(createRole(1, "AUTHOR_ROLE"));
		roleList.add(createRole(2, "REVIEWER_ROLE"));

		academicDisciplines.add(createAcademicDisciplines("01", "Architecture"));
		academicDisciplines.add(createAcademicDisciplines("02", "Arts and Humanities"));
		academicDisciplines.add(createAcademicDisciplines("02004", "Art and Design"));
	}

	private static AcademicDisciplines createAcademicDisciplines(String id, String name) {
		AcademicDisciplines academicDisciplines = new AcademicDisciplines();
		academicDisciplines.setAcademicDisciplinesId(id);
		academicDisciplines.setAcademicDisciplinesName(name);
		return academicDisciplines;
	}

	private static Role createRole(int id, String roleName) {
		Role role = new Role();
		role.setRoleId(id);
		role.setRole(roleName);
		return role;
	}

	@Test
	public void getDefaultRolesTest() {
		List<Role> roleList = userRegistrationMapper.getDefaultRoles();

		for (Role role : roleList) {
			System.out.println("Default Roles: " + role.getRoleId() + " - " + role.getRole());
		}
	}

	@Test
	public void inserNewUserAliasTest() {
		userRegistrationMapper.insertUserAlias(user.getUserName());

		System.out.println("Inserted id " + userRegistrationMapper.getUserId(user.getUserName()));
		System.out.println("Inserted userName " + user.getUserName());
	}

	@Test
	public void insertNewUserTest() {
		userRegistrationMapper.insertUserAlias(user.getUserName());
		int userId = userRegistrationMapper.getUserId(user.getUserName());
		userRegistrationMapper.insertUser(user, userId);
	}

	@Test
	public void insertNewPasswordTest() {
		userRegistrationMapper.insertUserAlias(user.getUserName());
		int userId = userRegistrationMapper.getUserId(user.getUserName());

		userRegistrationMapper.insertPassword(password, userId);
	}

	@Test
	public void insertLoginTest() {
		userRegistrationMapper.insertUserAlias(user.getUserName());
		int userId = userRegistrationMapper.getUserId(user.getUserName());
		userRegistrationMapper.insertPassword(password, userId);

		int passwordId = userRegistrationMapper.getPasswordId(userId);
		userRegistrationMapper.insertLogin(user.getUserName(), passwordId);
	}

	@Test
	public void isnertDefaultRolesTest() {
		userRegistrationMapper.insertUserAlias(user.getUserName());
		int userId = userRegistrationMapper.getUserId(user.getUserName());

		userRegistrationMapper.insertUserRoles(roleList, userId);
	}

	@Test
	public void insertAcademicDisciplines() {
		userRegistrationMapper.insertUserAlias(user.getUserName());
		int userId = userRegistrationMapper.getUserId(user.getUserName());

		userRegistrationMapper.insertAcadamicDisciplines(academicDisciplines, userId);
	}
}
