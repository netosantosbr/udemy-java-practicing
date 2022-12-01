package com.udemy.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.udemy.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderItems; 
	
	public Order() {	
	}
	
	public Order(Date moment, OrderStatus status, Client client, List<OrderItem> orderItems) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.orderItems = orderItems;
	}



	public void addItem(OrderItem item) {
		if(this.orderItems == null) {
			this.orderItems = new ArrayList<>();
		}
		this.orderItems.add(item);
	}
	
	public void removeItem(OrderItem item) {
		if(this.orderItems != null) {
			this.orderItems.remove(item);
		}
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem oi : orderItems) {
			total += oi.subTotal();
		}
		return total;
	}
	
	//Getters e Setters
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}
