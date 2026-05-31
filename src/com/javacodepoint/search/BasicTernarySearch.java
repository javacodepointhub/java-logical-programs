package com.javacodepoint.search;

public class BasicTernarySearch {
	public static int ternarySearch(int[] array, int low, int high, int key) {
		if (low <= high) {
			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;

			if (array[mid1] == key) {
				return mid1;
			}
			if (array[mid2] == key) {
				return mid2;
			}

			if (key < array[mid1]) {
				return ternarySearch(array, low, mid1 - 1, key);
			} else if (key > array[mid2]) {
				return ternarySearch(array, mid2 + 1, high, key);
			} else {
				return ternarySearch(array, mid1 + 1, mid2 - 1, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int key = 50;

		int result = ternarySearch(numbers, 0, numbers.length - 1, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
