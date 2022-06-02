package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	public Employee(Long empId, String empName, String empEmail) {
		super();
		this.id = empId;
		this.name = empName;
		this.email = empEmail;
	}
	public Employee() {
		super();
	}
	
	public Long getEmpId() {
		return id;
	}
	public void setEmpId(Long long1) {
		this.id = long1;
	}
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String empName) {
		this.name = empName;
	}
	public String getEmpEmail() {
		return email;
	}
	public void setEmpEmail(String empEmail) {
		this.email = empEmail;
	}
	
	

	
}
