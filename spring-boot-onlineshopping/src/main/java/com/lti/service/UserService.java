package com.lti.service;

import java.util.List;

import com.lti.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public User loginUser(User user);
}
