package com.javacodepoint.array;

public class RemoveDuplicateInArrayDemo2 {

	// Method to remove duplicate elements
	public static int removeDuplicate(int arr[]) {

		// array length
		int n = arr.length;

		// There is no duplicate element in array if length is 0 or 1
		if (n == 0 || n == 1) {
			return n;
		}
		// Separate index
		int index = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[index++] = arr[i];
			}
		}
		arr[index++] = arr[n - 1];

		return index;
	}

	// Main method
	public static void main(String[] args) {

		// Declare and Initialize an integer array
		int arr[] = { 5, 5, 10, 15, 16, 16, 20, 20, 25 };

		int length = removeDuplicate(arr);

		// After removing the duplicate elements, printing unique elements
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
