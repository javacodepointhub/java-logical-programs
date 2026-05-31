package com.javacodepoint.array;

public class FindEvenSumInArray {

	// Main method
	public static void main(String[] args) {

		// Declare and Initialize an integer array
		int arr[] = { 2, 4, 3, 8, 11, 50, 7, 15, 5 };

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
