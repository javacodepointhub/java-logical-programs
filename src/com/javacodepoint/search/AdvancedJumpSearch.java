package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.List;

class ProductClass {
	private int price;
	private String name;

	public ProductClass(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ProductClass{name='" + name + "', price=" + price + "}";
	}
}

public class AdvancedJumpSearch {
	public static int jumpSearch(List<ProductClass> products, int key) {
		int n = products.size();
		int step = (int) Math.sqrt(n);
		int prev = 0;

		// Jump through blocks
		while (products.get(Math.min(step, n) - 1).getPrice() < key) {
			prev = step;
			step += (int) Math.sqrt(n);
			if (prev >= n) {
				return -1;
			}
		}

		// Linear search within the block
		while (products.get(prev).getPrice() < key) {
			prev++;
			if (prev == Math.min(step, n)) {
				return -1;
			}
		}

		// Check if the key is found
		if (products.get(prev).getPrice() == key) {
			return prev;
		}
		return -1;
	}

	public static void main(String[] args) {
		List<ProductClass> products = new ArrayList<>();
		products.add(new ProductClass(100, "Laptop"));
		products.add(new ProductClass(200, "Tablet"));
		products.add(new ProductClass(300, "Smartphone"));
		products.add(new ProductClass(400, "Smartwatch"));

		int key = 300;

		int result = jumpSearch(products, key);

		if (result != -1) {
			System.out.println("Product found: " + products.get(result));
		} else {
			System.out.println("Product not found.");
		}
	}
}
