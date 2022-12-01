package com.udemy.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FATURA \n")
		.append("PAGAMENTO BÁSICO: " + getBasicPayment() + "\n")
		.append("IMPOSTO: " + getTax() + "\n")
		.append("PAGAMENTO TOTAL: " + getTotalPayment());
		
		return sb.toString();
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	public Double getBasicPayment() {
		return basicPayment;
	}
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
