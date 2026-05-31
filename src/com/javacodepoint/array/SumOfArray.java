package com.javacodepoint.array;

public class SumOfArray {

	public static void main(String[] args) {

		// Declare and Initialize an integer Array
		int arr[] = { 4, 5, 1, 6, 4, 15, 7 };

		// Declare a sum variable to calculate the sum of the array.
		int sum = 0;

		// Iterating all array element to calculate the sum
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		// Printing the calculated total sum
		System.out.println("The total sum of the given array: " + sum);

	}

}
