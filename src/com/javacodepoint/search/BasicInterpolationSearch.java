package com.javacodepoint.search;

public class BasicInterpolationSearch {
	public static int interpolationSearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high && key >= array[low] && key <= array[high]) {
			if (low == high) {
				if (array[low] == key)
					return low;
				return -1;
			}

			// Estimate position
			int pos = low + ((key - array[low]) * (high - low)) / (array[high] - array[low]);

			// Check if the key is found
			if (array[pos] == key) {
				return pos;
			}

			// If the key is larger, search the right side
			if (array[pos] < key) {
				low = pos + 1;
			} else { // If the key is smaller, search the left side
				high = pos - 1;
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int key = 70;

		int result = interpolationSearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
