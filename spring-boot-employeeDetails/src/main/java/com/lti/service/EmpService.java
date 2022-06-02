package com.lti.service;

import java.util.List;

import com.lti.entity.EmpRequest;
import com.lti.entity.Employee;

public interface EmpService {

	public Employee addEmp(EmpRequest emp);
	
	public Employee updateEmp(EmpRequest emp);
	 
	public Boolean deleteEmp(EmpRequest emp);  
	
}
