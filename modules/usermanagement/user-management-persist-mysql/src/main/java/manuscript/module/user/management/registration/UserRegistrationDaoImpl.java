package manuscript.module.user.management.registration;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.AdditionalData;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.registration.mapper.UserRegistrationMapper;
import manuscript.module.user.management.request.UserRegistrationRequest;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Repository
public class UserRegistrationDaoImpl implements UserRegistrationDao {

//	@Autowired
	private UserRegistrationMapper userRegistrationMapper;
	
	public UserRegistrationDaoImpl(UserRegistrationMapper userRegistrationMapper) {
		this.userRegistrationMapper = userRegistrationMapper;
	}

	@Override
	public boolean isNameReserved(String userName) {
		return userRegistrationMapper.isUserNameReserved(userName) > 0 ? true : false;
	}

	@Override
	@Cacheable(UserRegistrationDao.ACADEMIC_DISCIPLINES_CACHE)
	public List<AcademicDisciplines> getAcademicDisciplines() {
		return userRegistrationMapper.getAcademicDisciplines();
	}

	@Override
	public List<Role> getDefaultRole() {
		return userRegistrationMapper.getDefaultRoles();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void createRegistration(UserRegistrationRequest request, AdditionalData additionalData) {
		userRegistrationMapper.insertUserAlias(request.getUser().getUserName());
		int userId = userRegistrationMapper.getUserId(request.getUser().getUserName());
		
		userRegistrationMapper.insertUser(request.getUser(), userId);
		userRegistrationMapper.insertPassword(request.getPassword(), userId);
		
		userRegistrationMapper.insertLogin(request.getUser().getUserName(), userRegistrationMapper.getPasswordId(userId));
		userRegistrationMapper.insertUserRoles(additionalData.getDefaultRoles(), userId);
		
		userRegistrationMapper.insertAcadamicDisciplines(request.getAcademicDisciplines(), userId);
	}

}
