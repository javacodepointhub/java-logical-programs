package com.javacodepoint.search;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // Avoids overflow

			if (array[mid] == key) {
				return mid; // Key found at index mid
			} else if (array[mid] < key) {
				low = mid + 1; // Search in the right half
			} else {
				high = mid - 1; // Search in the left half
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 8, 15, 20, 27, 35, 50 };
		int key = 20;

		// Ensure the array is sorted
		Arrays.sort(numbers);

		int result = binarySearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
