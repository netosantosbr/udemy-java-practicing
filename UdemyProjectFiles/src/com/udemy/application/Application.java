package com.udemy.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.udemy.entities.Product;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Product> listOfProducts = new ArrayList<>();
		
		System.out.print("Insert file path: ");
		String filePath = sc.nextLine();
		
		File sourceFile = new File(filePath);
		String sourceFolderPath = sourceFile.getParent();
		
		boolean success = new File(sourceFolderPath + "\\out").mkdir();
		
		String targetFilePath = sourceFolderPath.concat("\\out\\sumary.csv");
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
				
			String[] lineParts = new String[3];
 			String itemCsv = br.readLine();
			while(itemCsv != null) {
				lineParts = itemCsv.split(",");
				listOfProducts.add(new Product(lineParts[0], Double.parseDouble(lineParts[1]),
						Integer.parseInt(lineParts[2].trim()) ));
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {
				for(Product p : listOfProducts) {
					bw.write(p.getName()+","+p.total());
					bw.newLine();
				}
				System.out.println("File written successfully.");
			} catch (IOException e) {
				System.err.println("Error writing file. " + e.getMessage());
			}
			
			
		} catch(IOException e) {
			System.err.println("Error reading file. " + e.getMessage());
		} 
		
		sc.close();
	}
}
