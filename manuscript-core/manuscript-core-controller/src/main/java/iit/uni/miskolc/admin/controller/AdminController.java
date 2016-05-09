package iit.uni.miskolc.admin.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import iit.uni.miskolc.admin.user.management.service.UserManagementService;
import iit.uni.miskolc.model.user.User;

@Controller(value = "/admin")
public class AdminController {
	private final static Logger logger = Logger.getLogger(AdminController.class);
	
	@Autowired
	UserManagementService userManagement;
	
	@RequestMapping(value = "/preload", method = RequestMethod.POST)
	@ResponseBody
	public List<User> preload(){
		//TODO load all registered user?
		return userManagement.getAllUser();
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public User search(@RequestParam String userName){
		//TODO search a user by user name
		return userManagement.getUserByUserName(userName);
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public User search(@RequestParam Integer id){
		//TODO search a user by user id
		return userManagement.getUserById(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(@RequestBody User user){
		//TODO update the user. Parameter will UserUpdateRequest
		return null;
	}

}
