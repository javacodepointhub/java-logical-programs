package com.javacodepoint.array;

public class SeparateEvenOddExample2 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30, 35, 40 };

		// Count even and odd numbers
		int evenCount = 0, oddCount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		// Create arrays for even and odd numbers
		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];

		// Populate the arrays
		int evenIndex = 0, oddIndex = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evenArray[evenIndex++] = num;
			} else {
				oddArray[oddIndex++] = num;
			}
		}

		// Print results
		System.out.println("Even elements:");
		for (int num : evenArray) {
			System.out.print(num + " ");
		}
		System.out.println("\nOdd elements:");
		for (int num : oddArray) {
			System.out.print(num + " ");
		}
	}
}
