package com.javacodepoint.sort;

public class MergeSort {
	
	// Merge two sorted subarrays into a single sorted array
	public static void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1; // Size of left subarray
		int n2 = right - mid; // Size of right subarray

		// Create temporary arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy data to temporary arrays
		for (int i = 0; i < n1; i++)
			leftArray[i] = array[left + i];
		for (int j = 0; j < n2; j++)
			rightArray[j] = array[mid + 1 + j];

		// Merge the temporary arrays back into the original array
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of leftArray, if any
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy remaining elements of rightArray, if any
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Sort the array using Merge Sort
	public static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			// Recursively sort the left and right halves
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			// Merge the sorted halves
			merge(array, left, mid, right);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Original Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		// Sort the array
		mergeSort(numbers, 0, numbers.length - 1);

		System.out.println("\nSorted Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
