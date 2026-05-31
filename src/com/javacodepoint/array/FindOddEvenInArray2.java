package com.javacodepoint.array;

import java.util.Scanner;

public class FindOddEvenInArray2 {

	// Main method
	public static void main(String[] args) {

		// Creating scanner object for reading user inputs
		Scanner sc = new Scanner(System.in);

		// Read the size of the Array
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();

		// Declare the integer Array of given size
		int arr[] = new int[n];

		// Reading the Array values
		System.out.println("Enter " + n + " element(s) of the Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Iterate the array
		for (int i = 0; i < arr.length; i++) {

			// Check whether the No. is Odd or Even
			// if remainder is 0 then, No. is an Even otherwise Odd
			if (arr[i] % 2 == 0) {
				// Even
				System.out.println(arr[i] + " is an Even number.");
			} else {
				// Odd
				System.out.println(arr[i] + " is an Odd number.");
			}
		}

	}

}
