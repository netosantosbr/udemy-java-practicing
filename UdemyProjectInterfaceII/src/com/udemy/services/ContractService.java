package com.udemy.services;

import java.time.LocalDate;

import com.udemy.entities.Contract;
import com.udemy.entities.Installment;

public class ContractService{
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		Double baseValue = contract.getValue() / months;
		LocalDate dateOfContract = contract.getContractDate();
			
		for(int i = 1; i <= months; i++) {
			double interest = onlinePaymentService.interest(baseValue, i);
			double fee = onlinePaymentService.paymentFee(baseValue + interest);
			double totalValue = baseValue + (interest + fee);
			contract.addInstallment(new Installment(dateOfContract.plusMonths(i), totalValue));
		}
	}
}
