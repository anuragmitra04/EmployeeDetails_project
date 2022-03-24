package com.lti.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.service.UserService;

	@RestController
	public class HelloController {
		
		@Autowired
		private UserService userService;
		
		@RequestMapping("/hello.lti")
		public String hello() {
			return "welcome to REST API Development using Spring Boot";
		}
		
		@CrossOrigin
		@PostMapping(path="/signup",consumes = "application/json")
		public User register(@RequestBody User user) {
			
			return this.userService.addUser(user);
		}
		
		@CrossOrigin
		@PostMapping(path="/login",consumes = "application/json")
		public User login(@RequestBody User user) {
			return this.userService.loginUser(user);
		}


	}

