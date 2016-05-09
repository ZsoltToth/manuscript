package iit.uni.miskolc.admin.user.management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import iit.uni.miskolc.admin.user.management.service.UserManagementService;
import iit.uni.miskolc.model.user.User;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRoleById(String userName, String role) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUserRoleBy(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
