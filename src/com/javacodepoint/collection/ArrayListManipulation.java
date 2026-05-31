package com.javacodepoint.collection;

import java.util.ArrayList;

public class ArrayListManipulation {
	
	public static void main(String[] args) {
		// Create an ArrayList to store integers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Adding elements to the ArrayList
		numbers.add(10); // Add the integer 10 to the list
		numbers.add(20); // Add the integer 20 to the list
		numbers.add(30); // Add the integer 30 to the list

		System.out.println("ArrayList after adding elements: " + numbers);

		// Removing an element from the ArrayList
		numbers.remove(1); // Remove the element at index 1 (20)

		System.out.println("ArrayList after removing element at index 1: " + numbers);

		// Finding the size of the ArrayList
		int size = numbers.size(); // Get the number of elements in the list

		System.out.println("Size of the ArrayList: " + size);
	}
}
