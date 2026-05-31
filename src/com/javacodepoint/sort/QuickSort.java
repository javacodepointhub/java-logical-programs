package com.javacodepoint.sort;

public class QuickSort {

	// Partition method to rearrange the array
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high]; // Pivot is the last element
		int i = low - 1; // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (array[j] <= pivot) {
				i++;
				// Swap array[i] and array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// Swap the pivot element with the element at i + 1
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1; // Return the pivot index
	}

	// Recursive Quick Sort method
	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			// Partition the array and get the pivot index
			int pivotIndex = partition(array, low, high);

			// Recursively sort the left and right subarrays
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 80, 30, 90, 40, 50, 70 };

		System.out.println("Original Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		// Sort the array using Quick Sort
		quickSort(numbers, 0, numbers.length - 1);

		System.out.println("\nSorted Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
