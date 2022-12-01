package com.udemy.tools;

import java.util.Comparator;

import com.udemy.entities.Product;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product firstProduct, Product secondProduct) {
		return firstProduct.getName().toUpperCase().compareTo(secondProduct.getName().toUpperCase());
	}
	
}
