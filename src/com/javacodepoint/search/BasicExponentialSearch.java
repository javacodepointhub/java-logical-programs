package com.javacodepoint.search;

public class BasicExponentialSearch {
	public static int exponentialSearch(int[] array, int key) {
		int n = array.length;

		// If the key is at the first position
		if (array[0] == key) {
			return 0;
		}

		// Find the range for Binary Search
		int i = 1;
		while (i < n && array[i] <= key) {
			i *= 2;
		}

		// Perform Binary Search in the found range
		return binarySearch(array, i / 2, Math.min(i, n - 1), key);
	}

	private static int binarySearch(int[] array, int low, int high, int key) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == key) {
				return mid;
			}

			if (array[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int key = 70;

		int result = exponentialSearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
