package com.javacodepoint.array;

public class RemoveDuplicateInArrayDemo {

	// Method to remove duplicate elements
	public static int removeDuplicate(int arr[]) {

		int n = arr.length;
		// There is no duplicate element in array if length is 0 or 1
		if (n == 0 || n == 1) {
			return n;
		}
		// Temporary array to hold unique elements
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		// Update the original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	// Main method
	public static void main(String[] args) {

		// Declare and Initialize an integer array
		int arr[] = { 1, 1, 4, 5, 5, 8, 10, 10, 20, 20 };

		int length = removeDuplicate(arr);

		// After removing the duplicate elements, printing unique elements
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
