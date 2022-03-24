package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserDao;
import com.lti.entity.User;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	public UserDao userDao;

	@Override
	public User addUser(User user) {
		String registerMsg = null;
		User registerUser = new User();
		userDao.save(user);
		if(user!=null) {
			registerMsg = "User successfully registered";
			registerUser.setUserName(user.getUserName());;
			registerUser.setUserId(user.getUserId());
			registerUser.setAddress(user.getAddress());
			registerUser.setEmail(user.getEmail());
			registerUser.setMobile(user.getMobile());
			registerUser.setOrder(user.getOrder());
		}else {
			registerMsg= "Unable to register";
		}
		registerUser.setMsg(registerMsg);
		return registerUser;
	}
	
	@Override
	public User loginUser(User user) {
		String loginMsg = null;
		User loginUser = new User();
		List<User> user1= userDao.findAll();
		for(User each:user1) {
			if(each.getEmail()!=null && (each.getEmail().equals(user.getEmail())) && (each.getPassword().equals(user.getPassword()))) {
				loginMsg = "Succesfully login";
				loginUser = new User();
				loginUser.setUserId(each.getUserId());
				loginUser.setUserName(each.getUserName());
				loginUser.setEmail(each.getEmail());
				loginUser.setMobile(each.getMobile());
				loginUser.setAddress(each.getAddress());
//				loginUser.setOrder(each.getOrder());
				break;
			}else {
				loginMsg = "User not found";
			}
			
		}
		loginUser.setMsg(loginMsg);
		return loginUser;
				
	}
	

}
