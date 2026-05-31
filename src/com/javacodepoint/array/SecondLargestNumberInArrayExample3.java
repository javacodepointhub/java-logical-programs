package com.javacodepoint.array;

public class SecondLargestNumberInArrayExample3 {

	// Method to find second largest number
	public static int findSecondLargestNo(int arr[]) throws Exception {

		// Array length
		int n = arr.length;
		if (n < 2) {
			throw new Exception("Array length should be at least 2");
		}
		// Initialize max and secondMax
		int max = arr[0];
		int secondMax = arr[1];

		// Swap the number if max < secondMax
		if (max < secondMax) {
			int temp = max;
			max = secondMax;
			secondMax = temp;
		}

		// Iterate the array from index 2 to array length
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}

		return secondMax;
	}

	// Main method
	public static void main(String[] args) throws Exception {

		// Declare and Initialize an integer Array
		int arr[] = { 5, 8, 12, 8, -5, 0, 4, 22, 7, 11 };

		int secondMax = findSecondLargestNo(arr);

		// Print the second largest number
		System.out.println("The Second Largest Number in the Array: " + secondMax);

	}

}
