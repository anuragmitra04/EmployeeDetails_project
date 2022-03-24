package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_payment")
public class Payment {
	
	@Id
	@GeneratedValue
	private int payid;
	
	
	private String status;
	private String PaymentType;
	

	@OneToOne
	@JoinColumn(name="cartitemid")
    private CartItem cartitem;


	public int getPayid() {
		return payid;
	}


	public void setPayid(int payid) {
		this.payid = payid;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPaymentType() {
		return PaymentType;
	}


	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}


	public CartItem getCartitem() {
		return cartitem;
	}


	public void setCartitem(CartItem cartitem) {
		this.cartitem = cartitem;
	}
	
	
	
}
