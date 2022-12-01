package com.udemy.entities;

import com.udemy.enums.Color;

public class Circle extends Shape{
	private Double radius;
	
	public Circle() {
	}
	
	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public Double area() { 
		return Math.PI * (radius * radius);
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
