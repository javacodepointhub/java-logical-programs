package com.javacodepoint.array;

public class FindAvgOfOddEvenInArray {

	// Main method
	public static void main(String[] args) {

		// Declare and Initialize an integer array
		int arr[] = { 2, 4, 3, 8, 11, 50, 7, 15, 5 };

		// Declare and Initialize required variables
		int evenSum = 0, oddSum = 0, evenCount = 0, oddCount = 0;
		float evenAvg = 0.0f, oddAvg = 0.0f;

		// Iterate the array
		for (int i = 0; i < arr.length; i++) {

			// Check whether the No. is an Even or Odd
			// if remainder is 0, it is an Even number otherwise Odd number
			if (arr[i] % 2 == 0) { // Even
				evenCount++;
				evenSum = evenSum + arr[i];
			} else { // Odd
				oddCount++;
				oddSum = oddSum + arr[i];

			}
		}

		// Calculate the average of even numbers
		evenAvg = (float) evenSum / evenCount;

		// Print the result
		System.out.println("Sum of Even numbers in Array= " + evenSum);
		System.out.println("Count of Even numbers in Array= " + evenCount);
		System.out.println("The average of Even numbers= " + evenAvg);

		// Calculate the average of odd numbers
		oddAvg = (float) oddSum / oddCount;

		// Print the result
		System.out.println("Sum of Odd numbers in Array= " + oddSum);
		System.out.println("Count of Odd numbers in Array= " + oddCount);
		System.out.println("The average of Odd numbers= " + oddAvg);

	}

}
