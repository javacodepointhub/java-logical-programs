package com.javacodepoint.array;

public class MergeArrayExample1 {

	public static void main(String[] args) {

		// Declare and Initialize first integer array
		int arr1[] = { 1, 2, 5, 6, 8 };

		// Declare and Initialize second integer array
		int arr2[] = { 5, 7, 10, 12, 20, 25 };

		// Declare another array to merge both array
		// The length of arr3 will be total sum of arr1 and arr2 length
		int arr3[] = new int[arr1.length + arr2.length];

		int count = 0;

		// Copy arr1 elements to arr3
		for (int i = 0; i < arr1.length; i++) {
			arr3[count++] = arr1[i];
		}

		// Copy arr2 elements to arr3
		for (int i = 0; i < arr2.length; i++) {
			arr3[count++] = arr2[i];
		}

		// Print the merged array elements
		System.out.println("Merged array elements: ");
		for (int i = 0; i < count; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
