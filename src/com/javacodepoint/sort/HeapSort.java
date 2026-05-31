package com.javacodepoint.sort;

public class HeapSort {
	
	// Function to sort an array using Heap Sort
	public static void heapSort(int[] array) {
		int n = array.length;

		// Step 1: Build Max-Heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}

		// Step 2: Extract elements from the heap one by one
		for (int i = n - 1; i > 0; i--) {
			// Move the current root (max) to the end
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			// Restore the heap property for the reduced heap
			heapify(array, i, 0);
		}
	}

	// Function to maintain the heap property
	public static void heapify(int[] array, int heapSize, int i) {
		int largest = i; // Initialize largest as root
		int left = 2 * i + 1; // Left child index
		int right = 2 * i + 2; // Right child index

		// If left child is larger than root
		if (left < heapSize && array[left] > array[largest]) {
			largest = left;
		}

		// If right child is larger than largest so far
		if (right < heapSize && array[right] > array[largest]) {
			largest = right;
		}

		// If largest is not the root
		if (largest != i) {
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;

			// Recursively heapify the affected subtree
			heapify(array, heapSize, largest);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Original Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		// Sort the array using Heap Sort
		heapSort(numbers);

		System.out.println("\nSorted Array:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
