package com.javacodepoint.search;

public class BasicBinarySearch {
	
	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // Calculate mid to prevent overflow
			if (array[mid] == key) {
				return mid; // Key found, return index
			} else if (array[mid] < key) {
				low = mid + 1; // Search in the right half
			} else {
				high = mid - 1; // Search in the left half
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int key = 30;

		int result = binarySearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
