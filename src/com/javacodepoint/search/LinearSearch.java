package com.javacodepoint.search;

public class LinearSearch {
	
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i; // Return the index where the key is found
			}
		}
		return -1; // Return -1 if the key is not found
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 12, 18, 23, 45, 89 };
		int key = 23;

		int result = linearSearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
