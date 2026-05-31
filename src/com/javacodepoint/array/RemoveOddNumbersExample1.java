package com.javacodepoint.array;

public class RemoveOddNumbersExample1 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30, 35, 40 };

		// Count even numbers
		int evenCount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			}
		}

		// Create a new array for even numbers
		int[] evenArray = new int[evenCount];
		int index = 0;

		// Populate the new array with even numbers
		for (int num : arr) {
			if (num % 2 == 0) {
				evenArray[index++] = num;
			}
		}

		// Print the new array
		System.out.println("Array after removing odd numbers:");
		for (int num : evenArray) {
			System.out.print(num + " ");
		}
	}
}
