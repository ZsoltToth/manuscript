package iit.uni.miskolc.mybatis.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import iit.uni.miskolc.model.user.User;
import iit.uni.miskolc.mybatis.mappers.UserMapper;

public class Service {

	@Autowired
	UserMapper mapper;
	
	public Collection<User> selectUsers(){
		return mapper.selectUsers();
	}
	
	public User getUserByUsername(String username){
		return mapper.selectUserByUsername(username);
	}
	
	public void InsertUser(User user){
		mapper.insertUser(user);
	}
	
	public void deleteUserByUsername(String username){
		mapper.deleteUserByUsername(username);
	}
	
	public void updateUserData(User user){
		mapper.updateUserData(user);
	}
	
	public void setUserRole(String role){
		mapper.setUserRole(role);
	}
}
