package com.javacodepoint.sort;

public class SelectionSort {
	
	// Method to perform selection sort
	public static void selectionSort(int[] array) {
		int n = array.length;

		// Traverse through the entire array
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in the unsorted part
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j; // Update the index of the smallest element
				}
			}

			// Swap the minimum element with the first unsorted element
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

	public static void main(String[] args) {
		// Example input array
		int[] numbers = { 64, 25, 12, 22, 11 };

		// Print the original array
		System.out.println("Original Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		// Perform selection sort
		selectionSort(numbers);

		// Print the sorted array
		System.out.println("\nSorted Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
