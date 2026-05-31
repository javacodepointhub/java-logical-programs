package com.javacodepoint.array;

import java.util.Scanner;

public class FindEvenSumInArray2 {

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

		// To calculate sum of even numbers
		int evenSum = 0;

		System.out.println("The sum of all Even numbers:");

		// Iterate the array
		for (int i = 0; i < arr.length; i++) {

			// Check whether the No. is an Even
			// if reminder is 0, it is an Even number
			if (arr[i] % 2 == 0) {

				if (evenSum > 0) {
					System.out.print(" + " + arr[i]);
				} else {
					System.out.print(arr[i]);
				}

				// Calculate the even sum
				evenSum = evenSum + arr[i];
			}
		}

		// Print the final result
		System.out.println(" = " + evenSum);

	}

}
