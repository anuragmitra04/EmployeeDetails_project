package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.EmpDao;
import com.lti.entity.EmpRequest;
import com.lti.entity.Employee;

@Service
public class EmpServiceImp implements EmpService {
	
	@Autowired
	public EmpDao empDao;

	@Override
	public Employee addEmp(EmpRequest emp) {
//		String registerMsg = null;
		Employee newEmp = new Employee();
		
		if(emp!=null) {
//			registerMsg = "User successfully registered";
			newEmp.setEmpName(emp.getName());;
			newEmp.setEmpEmail(emp.getEmail());
			newEmp.setEmpId(emp.getId());
			empDao.save(newEmp);
		}else {
//			registerMsg= "Unable to register";
		}
//		newEmp.setMsg(registerMsg);
		return newEmp;
	}
	
	@Override
	public Employee updateEmp(EmpRequest emp) {
		Employee updateUser = new Employee();
		List<Employee> user= empDao.findAll();
		for(Employee each:user) {
			if(each.getEmpId()!=null && (each.getEmpId().equals(emp.getId()))) {
				updateUser = new Employee();
				updateUser.setEmpName(emp.getName());
				updateUser.setEmpEmail(emp.getEmail());
				updateUser.setEmpId(each.getEmpId());
//				Employee updatedValue= emp.updateWith(updateUser);
				empDao.save(updateUser);
				break;
			}else {
			}
			
		}
		return updateUser;
				
	}
	
	@Override
	public Boolean deleteEmp(EmpRequest emp) {
		Boolean result = false;
//		Employee updateUser = new Employee();
//		List<Employee> user= empDao.findAll();
//		for(Employee each:user) {
//			if(each.getEmpId()!=null && (each.getEmpId().equals(emp.getId()))) {
//				updateUser = new Employee();
//				updateUser.setEmpName(emp.getName());
//				updateUser.setEmpEmail(emp.getEmail());
//				updateUser.setEmpId(each.getEmpId());
////				Employee updatedValue= emp.updateWith(updateUser);
//				empDao.save(updateUser);
//				break;
//			}else {
//			}
//			
//		}
//		return updateUser;
		try {
			empDao.deleteById(emp.getId());
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
				
	}
	

}
