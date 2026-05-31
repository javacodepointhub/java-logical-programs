package com.javacodepoint.array;

public class SecondLargestNumberInArrayExample1 {

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

		// Declare and Initialize an integer Array
		int arr[] = { 5, 8, 12, 8, -5, 0, 4, 22, 7, 11 };

		int secondMax = findSecondLargestNo(arr);

		// Print the second largest number
		System.out.println("The Second Largest Number in the Array: " + secondMax);

	}

}
