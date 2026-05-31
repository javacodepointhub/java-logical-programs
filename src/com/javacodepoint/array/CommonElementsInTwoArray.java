package com.javacodepoint.array;

public class CommonElementsInTwoArray {

	public static void main(String[] args) {

		// Declare and Initialize Two arrays
		int arr1[] = { 4, 5, 1, 6, 4, 15 };
		int arr2[] = { 3, 5, 6, 1, 9, 6, 15, 20, 25 };

		// 3rd Array to store the Sum
		int arr3[] = new int[arr1.length];

		// Adding arr1 and arr2 and storing into arr3
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}

		// Print the arr3 elements
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
