package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ProductX {
	private int id;
	private String name;

	public ProductX(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ProductX{id=" + id + ", name='" + name + "'}";
	}
}

public class AdvancedTernarySearch {
	public static int ternarySearch(List<ProductX> products, int low, int high, int key) {
		if (low <= high) {
			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;

			if (products.get(mid1).getId() == key) {
				return mid1;
			}
			if (products.get(mid2).getId() == key) {
				return mid2;
			}

			if (key < products.get(mid1).getId()) {
				return ternarySearch(products, low, mid1 - 1, key);
			} else if (key > products.get(mid2).getId()) {
				return ternarySearch(products, mid2 + 1, high, key);
			} else {
				return ternarySearch(products, mid1 + 1, mid2 - 1, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<ProductX> products = new ArrayList<>();
		products.add(new ProductX(101, "Laptop"));
		products.add(new ProductX(102, "Tablet"));
		products.add(new ProductX(103, "Smartphone"));
		products.add(new ProductX(104, "Smartwatch"));

		int key = 103;

		// Sort products by ID
		products.sort(Comparator.comparingInt(ProductX::getId));

		int result = ternarySearch(products, 0, products.size() - 1, key);

		if (result != -1) {
			System.out.println("Product found: " + products.get(result));
		} else {
			System.out.println("Product not found.");
		}
	}
}
