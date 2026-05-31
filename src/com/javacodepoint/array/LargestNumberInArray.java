package com.javacodepoint.array;

public class LargestNumberInArray {

	public static void main(String[] args) {

		// Declare and Initialize an integer Array
		int arr[] = { 5, 3, 8, 0, 15, -5, 12 };

		// Sorting the array element in descending order
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Array 0th element will be the largest no.
		int max = arr[0];

		// Printing the largest number
		System.out.println("The Largest Number in the Array: " + max);

	}

}
