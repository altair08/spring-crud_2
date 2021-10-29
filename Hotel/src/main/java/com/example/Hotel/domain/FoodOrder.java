package com.example.Hotel.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodOrder {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String customername;
    private String foodname;
    private int quantity;
    
    
	public FoodOrder() {

	}
	public FoodOrder(Long id, String customername, String foodname, int quantity) {
	
		this.id = id;
		this.customername = customername;
		this.foodname = foodname;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}