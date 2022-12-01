package com.udemy.application;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.udemy.entities.CarRental;
import com.udemy.entities.Invoice;
import com.udemy.entities.Vehicle;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt2);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt2);
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = sc.nextDouble();
		
		Double basicPayment = 0.0;
		Double tax = 0.0;
		Duration duration = Duration.between(start, finish);
		if(duration.toHours() > 12) {
			basicPayment = Math.ceil(duration.toHours() / 24.0) * pricePerDay;
		} else {
			basicPayment = Math.ceil(duration.toMinutes() / 60.0) * pricePerHour;
		}
		
		if(basicPayment <= 100.0) {
			tax = basicPayment * 0.20;
		} else {
			tax = basicPayment * 0.15;
		}
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(model), new Invoice(basicPayment, tax));
		
		System.out.println(carRental.getInvoice().toString());
	}
}
