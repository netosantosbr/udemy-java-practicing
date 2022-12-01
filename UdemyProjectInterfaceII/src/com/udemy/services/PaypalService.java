package com.udemy.services;

public class PaypalService implements OnlinePaymentService {
	public static final Double PAYMENT_TAX = 0.02;
	public static final Double INTEREST_TAX = 0.01;
	
	public Double paymentFee(Double amount) {
		return amount * PAYMENT_TAX;
	}
	
	public Double interest(Double amount, Integer months) {
		return amount * INTEREST_TAX * months.doubleValue();
	}
}
