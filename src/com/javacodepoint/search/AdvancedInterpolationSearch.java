package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
	private int price;
	private String name;

	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product{name='" + name + "', price=" + price + "}";
	}
}

public class AdvancedInterpolationSearch {
	public static int interpolationSearch(List<Product> products, int key) {
		int low = 0;
		int high = products.size() - 1;

		while (low <= high && key >= products.get(low).getPrice() && key <= products.get(high).getPrice()) {
			if (low == high) {
				if (products.get(low).getPrice() == key)
					return low;
				return -1;
			}

			// Estimate position
			int pos = low + ((key - products.get(low).getPrice()) * (high - low))
					/ (products.get(high).getPrice() - products.get(low).getPrice());

			// Check if the key is found
			if (products.get(pos).getPrice() == key) {
				return pos;
			}

			// If the key is larger, search the right side
			if (products.get(pos).getPrice() < key) {
				low = pos + 1;
			} else { // If the key is smaller, search the left side
				high = pos - 1;
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(100, "Laptop"));
		products.add(new Product(200, "Smartphone"));
		products.add(new Product(300, "Tablet"));
		products.add(new Product(400, "Smartwatch"));

		int key = 300;

		// Sort products by price
		products.sort(Comparator.comparingInt(Product::getPrice));

		int result = interpolationSearch(products, key);

		if (result != -1) {
			System.out.println("Product found: " + products.get(result));
		} else {
			System.out.println("Product not found.");
		}
	}
}