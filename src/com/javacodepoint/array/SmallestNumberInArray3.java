package com.javacodepoint.array;

import java.util.Scanner;

public class SmallestNumberInArray3 {

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

		// Assume 0th element will be the smallest no.
		int smallNumber = arr[0];

		// Iterate the array from index 1
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallNumber) {
				smallNumber = arr[i];
			}
		}

		// Printing the smallest number
		System.out.println("The Smallest Number in Given Array: " + smallNumber);

	}

}
