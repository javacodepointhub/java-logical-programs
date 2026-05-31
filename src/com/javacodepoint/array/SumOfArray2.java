package com.javacodepoint.array;

import java.util.Scanner;

public class SumOfArray2 {

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
