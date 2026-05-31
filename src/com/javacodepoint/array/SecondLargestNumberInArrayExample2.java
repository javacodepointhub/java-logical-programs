package com.javacodepoint.array;

import java.util.Scanner;

public class SecondLargestNumberInArrayExample2 {

	// Method to find second largest number
	public static int findSecondLargestNo(int arr[]) {

		// Sorting the array element in ascending order
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// 2nd last element will be the second largest number
		return arr[arr.length - 2];
	}

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

		int secondMax = findSecondLargestNo(arr);

		// Print the second largest number
		System.out.println("The Second Largest Number in the Array: " + secondMax);

	}

}
