package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cart")
public class Cart {
	
	@Id
	@GeneratedValue
	private int cartid;
	private double totalPrice;
	
	@OneToOne
	@JoinColumn(name="usid")
	private User user;
	

	@OneToMany(mappedBy = "cart")
	private List<CartItem> cartitem;


	public int getCartid() {
		return cartid;
	}


	public void setCartid(int cartid) {
		this.cartid = cartid;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<CartItem> getCartitem() {
		return cartitem;
	}


	public void setCartitem(List<CartItem> cartitem) {
		this.cartitem = cartitem;
	}
	
	
	
}
