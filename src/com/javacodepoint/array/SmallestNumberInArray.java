package com.javacodepoint.array;

public class SmallestNumberInArray {

	public static void main(String[] args) {

		// Declare and Initialize an integer Array
		int arr[] = { 4, 1, 8, -5, 8, 0, 12, 1 };

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

		// Array 0th element will be the smallest no.
		int smallNumber = arr[0];

		// Printing the smallest number
		System.out.println("The Smallest Number in the Array: " + smallNumber);

	}

}
