package com.lti.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.EmpRequest;
import com.lti.entity.Employee;
import com.lti.entity.Response;
import com.lti.service.EmpService;

	@RestController
	public class HelloController {
		
		@Autowired
		private EmpService empService;
		
		@RequestMapping("/hello.lti")
		public String hello() {
			return "welcome to REST API Development using Spring Boot";
		}
		
		@CrossOrigin
		@PostMapping(path="/add_emp",consumes = "application/json")
		public Employee addEmp(@RequestBody EmpRequest emp) {
			System.out.println("REQUEST++++++++" + emp.getName() + emp.getEmail() + emp.getId());
			return this.empService.addEmp(emp);
//			return new ResponseEntity(HttpStatus.OK);
		}
		
		
		@CrossOrigin
		@PostMapping(path="/update",consumes = "application/json")
		public Employee updateEmp(@RequestBody EmpRequest emp) {
			System.out.println("UPDATE_REQUEST++++++++" + emp.getName() + emp.getEmail() + emp.getId());

			return this.empService.updateEmp(emp);
		}
		
//		@CrossOrigin
		@PostMapping(path="/delete",consumes = "application/json")
		public Response deleteEmp(@RequestBody EmpRequest emp) {
			System.out.println("Delete_REQUEST++++++++" + emp.getName() + emp.getEmail() + emp.getId());
			Boolean result =empService.deleteEmp(emp);
			if(result) {
				return new Response("Employee deleted");

			}
			return new Response("Ops! Employee not deleted");
		}
		
		


	}

