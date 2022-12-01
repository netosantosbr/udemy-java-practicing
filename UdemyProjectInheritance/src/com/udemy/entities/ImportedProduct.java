package com.udemy.entities;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName() + " $ ").append(totalPrice() + " ")
		.append("(Customs fee: $ ").append(customsFee + ")");
		
		return sb.toString();
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee; 
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	
}
