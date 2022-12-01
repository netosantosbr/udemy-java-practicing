package com.udemy.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.udemy.entities.ImportedProduct;
import com.udemy.entities.Product;
import com.udemy.entities.UsedProduct;

public class Application {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> listOfProducts = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		for(int i = 1; i <= numberOfProducts; i++) {
			Product pd = null;
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char cui = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch(cui) {
				case 'c': //Common
					pd = new Product(name, price);
					break;
				case 'u': //Used
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					sc.nextLine();
					String receivedDate = sc.nextLine();
					Date manufactureDate = sdf.parse(receivedDate);
					pd = new UsedProduct(name, price, manufactureDate);
					break;
				case 'i': //Imported
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					pd = new ImportedProduct(name, price, customsFee);
					break;
			}
			listOfProducts.add(pd);
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product p : listOfProducts) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}
