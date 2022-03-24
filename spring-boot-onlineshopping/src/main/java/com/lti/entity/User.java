package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tbl_user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	
	private String userName;
	private String password;
	private String email;
	private long mobile;
	private String address;
	
	@OneToMany(mappedBy="user")
    private List<Order> order;
	
	private String msg;
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String password, String email, long mobile, String address)
			 {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
