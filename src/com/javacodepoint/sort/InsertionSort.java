package com.javacodepoint.sort;

public class InsertionSort {

	// Method to perform insertion sort
	public static void insertionSort(int[] array) {
		int n = array.length;

		// Traverse the array from the second element
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;

			// Shift elements of the sorted part to the right to make space for the key
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}

			// Place the key in its correct position
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// Example input array
		int[] numbers = { 12, 11, 13, 5, 6 };

		// Print the original array
		System.out.println("Original Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		// Perform insertion sort
		insertionSort(numbers);

		// Print the sorted array
		System.out.println("\nSorted Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
