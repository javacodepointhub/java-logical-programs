package com.javacodepoint.array;

/*
 * Calculating the average of an Array using for each loop
 */
public class CalculateAverageUsingArray3 {

	public static void main(String[] args) {

		// Declaring and Initializing an integer array
		int arr[] = { 4, 5, 1, 6, 8 };

		// Declaring a sum variable and Initializing with 0
		// to calculate the sum of all array's elements.
		int sum = 0;

		// Declaring it for calculating the average
		float average = 0.0f;

		// Iterating all array element using for-each loop
		for (int value : arr) {
			sum += value;
		}

		// Calculating the average
		average = (float) sum / arr.length;

		// Printing the calculated average value
		System.out.println("The average of the given array: " + average);

	}

}
