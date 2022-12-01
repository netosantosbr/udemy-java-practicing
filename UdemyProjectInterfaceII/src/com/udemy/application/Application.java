package com.udemy.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.udemy.entities.Contract;
import com.udemy.entities.Installment;
import com.udemy.services.ContractService;
import com.udemy.services.OnlinePaymentService;
import com.udemy.services.PaypalService;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		Long number = sc.nextLong();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		Double contractAmount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractAmount);
				
		System.out.print("Entre com o número de parcelas: ");
		Integer installmentsNumber = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, installmentsNumber);
		
		System.out.println("Parcelas: ");
		for(Installment i : contract.getInstallments()) {
			System.out.println(i.toString());
		
		}
		
	}
}
