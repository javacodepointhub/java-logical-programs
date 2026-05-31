package com.javacodepoint.array;

import java.util.Arrays;

public class SecondLargestNumberInArrayExample4 {

	// Method to find second largest number
	public static int findSecondLargestNo(int arr[]) {

		// Sort the array
		Arrays.sort(arr);

		// Second largest number
		return arr[arr.length - 2];
	}

	// Main method
	public static void main(String[] args) {

		// Declare and Initialize an integer Array
		int arr[] = { 5, 8, 12, 15, 4, 22, 7, 11 };

		int secondMax = findSecondLargestNo(arr);

		// Print the second largest number
		System.out.println("The Second Largest Number in the Array: " + secondMax);

	}

}
