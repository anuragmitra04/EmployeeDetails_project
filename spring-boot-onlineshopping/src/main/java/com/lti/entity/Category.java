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
@Table(name="tbl_category")
public class Category {
	
	@Id
	@GeneratedValue
	private int catid;
	private String category;
	
	@OneToMany(mappedBy = "category")
	private List<Product> product;

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
  

    
    
}
