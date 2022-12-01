package com.udemy.entities;

import com.udemy.enums.Color;

public abstract class Shape {
	private Color color;
	
	public abstract Double area();
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
