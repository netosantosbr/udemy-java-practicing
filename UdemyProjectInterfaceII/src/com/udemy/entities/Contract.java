package com.udemy.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Long contractNumber;
	private LocalDate contractDate;
	private Double value;
	private List<Installment> installments;
	
	
	public Contract(Long contractNumber, LocalDate contractDate, Double value) {
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.value = value;
	}
	
	public void addInstallment(Installment installment) {
		if(installments == null) {
			this.installments = new ArrayList<>();
		}
		
		this.installments.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		if(installments != null) {
			this.installments.remove(installment);
		}
	}
	
	public List<Installment> getInstallments() {
		return this.installments;
	}
	
	public Long getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Long contractNumber) {
		this.contractNumber = contractNumber;
	}

	public LocalDate getContractDate() {
		return contractDate;
	}

	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
