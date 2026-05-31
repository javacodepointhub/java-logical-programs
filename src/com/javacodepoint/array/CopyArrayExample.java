package com.javacodepoint.array;

public class CopyArrayExample {

	public static void main(String[] args) {

		// Declare and Initialize an integer array
		int arr1[] = { 2, 4, 3, 8, 10, 0, 7, 15 };

		// Declare another array to copy with same size
		int arr2[] = new int[arr1.length];

		// Iterate first array and copy to second array
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Print the copied array
		System.out.println("Copied array elements: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
