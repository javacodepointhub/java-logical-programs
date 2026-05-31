package com.javacodepoint.collection;

import java.util.ArrayList;

public class GetFirstAndLastElementsDemo {
	
	public static void main(String[] args) {
		// Create an ArrayList of integers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Add some elements to the ArrayList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		// Check if the ArrayList is not empty
		if (!numbers.isEmpty()) {
			// Get the first element (element at index 0)
			int firstElement = numbers.get(0);

			// Get the last element (element at index size-1)
			int lastIndex = numbers.size() - 1;
			int lastElement = numbers.get(lastIndex);

			// Print the first and last elements
			System.out.println("First Element: " + firstElement);
			System.out.println("Last Element: " + lastElement);
		} else {
			System.out.println("The ArrayList is empty.");
		}
	}
}
