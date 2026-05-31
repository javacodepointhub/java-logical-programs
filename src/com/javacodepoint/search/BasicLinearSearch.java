package com.javacodepoint.search;

public class BasicLinearSearch {

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i; // Key found, return the index
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 8, 12, 15, 20 };
		int key = 12;

		int result = linearSearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
