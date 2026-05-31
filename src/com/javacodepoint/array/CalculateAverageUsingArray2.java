package com.javacodepoint.array;

import java.util.Scanner;

/*
 * Calculating the average of a given integer Array,
 * taking the array elements from user.
 */
public class CalculateAverageUsingArray2 {

	public static void main(String[] args) {

		// Creating scanner object for reading user inputs
		Scanner sc = new Scanner(System.in);
		
		// Read the size of the Array
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();
		
		// Declare the integer Array of given size
		int arr[] = new int[n];
		
		// Declaring a sum variable and Initializing with 0
		// to calculate the sum of all array's elements.
		int sum = 0;

		// Declaring it for calculating the average
		float average = 0.0f;

		// Reading the Array values
		System.out.println("Enter " + n + " element(s) of the Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Iterating all array element to calculate the sum
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		// Calculating the average
		average = (float) sum / n;

		// Printing the calculated average value
		System.out.println("The average of the given Array: " + average);

	}

}
