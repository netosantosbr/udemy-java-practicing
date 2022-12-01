package com.udemy.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.udemy.entities.Circle;
import com.udemy.entities.Rectangle;
import com.udemy.entities.Shape;
import com.udemy.enums.Color;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape> listOfShapes = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		
		for(int i = 1; i <= numberOfShapes; i++) {
			Shape shape = null;
			System.out.println("Shape #"+i+" data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char rorc = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();
			
			
			switch(rorc) {
				case 'r':
					System.out.print("Width: ");
					double width = sc.nextDouble();
					System.out.print("Height: ");
					double height = sc.nextDouble();
					shape = new Rectangle(width, height, Color.valueOf(color));
					break;
				case 'c':
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					shape = new Circle(radius, Color.valueOf(color));
					break;
			}
			listOfShapes.add(shape);
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape sh : listOfShapes) {
			System.out.println(sh.area());
		}
		
		sc.close();
	}
}
