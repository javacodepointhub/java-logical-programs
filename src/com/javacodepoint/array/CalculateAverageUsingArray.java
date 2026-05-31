package com.javacodepoint.array;

/*
 * Calculating the average of a given integer Array
 */
public class CalculateAverageUsingArray {

	public static void main(String[] args) {

		// Declaring and Initializing an integer array
		int arr[] = { 2, 5, 1, 12, 8, 5, 7, 10 };

		// Declaring a sum variable and Initializing with 0
		// to calculate the sum of all array's elements.
		int sum = 0;

		// Declaring it for calculating the average
		float average = 0.0f;

		// Iterating all array element to calculate the sum
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		// Calculating the average
		average = (float) sum / arr.length;

		// Printing the calculated average value
		System.out.println("The average of the given array: " + average);

	}

}
