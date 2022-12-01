package com.udemy.models;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	public Double subTotal() {
		return price * quantity;
	}
	
	//Getters e Setters
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
