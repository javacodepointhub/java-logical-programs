package com.javacodepoint.array;

import java.util.Scanner;

public class LargestNumberInArray3 {

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

		// Assume 0th element will be the largest no.
		int largeNo = arr[0];

		// Iterate the array from index 1
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largeNo) {
				largeNo = arr[i];
			}
		}

		// Printing the largest number
		System.out.println("The Largest Number in Given Array: " + largeNo);

	}

}
