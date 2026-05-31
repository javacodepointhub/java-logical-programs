package com.javacodepoint.array;

import java.util.Scanner;

public class CopyArrayExample2 {

	public static void main(String[] args) {

		// Creating scanner object for reading user inputs
		Scanner sc = new Scanner(System.in);

		// Read the size of the Array
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();

		// Declare the integer Array of given size
		int arr1[] = new int[n];

		// Reading the Array values
		System.out.println("Enter " + n + " element(s) of the Array: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

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
