package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.Employee;

public interface EmpDao extends JpaRepository<Employee, Long>{

//	User findBy(Class<User> class1, String email, String password);

}
