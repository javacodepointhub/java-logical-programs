package com.javacodepoint.search;

public class BasicFibonacciSearch {
	
	public static int fibonacciSearch(int[] array, int key) {
		int n = array.length;

		// Initialize Fibonacci numbers
		int fib2 = 0; // (m-2)'th Fibonacci number
		int fib1 = 1; // (m-1)'th Fibonacci number
		int fibM = fib2 + fib1; // m'th Fibonacci number

		// Find the smallest Fibonacci number greater than or equal to n
		while (fibM < n) {
			fib2 = fib1;
			fib1 = fibM;
			fibM = fib2 + fib1;
		}

		// Marks the eliminated range from the front
		int offset = -1;

		while (fibM > 1) {
			int i = Math.min(offset + fib2, n - 1);

			// Compare key with array[i]
			if (array[i] < key) {
				fibM = fib1;
				fib1 = fib2;
				fib2 = fibM - fib1;
				offset = i;
			} else if (array[i] > key) {
				fibM = fib2;
				fib1 = fib1 - fib2;
				fib2 = fibM - fib1;
			} else {
				return i; // Key found
			}
		}

		// Check the last element
		if (fib1 == 1 && array[offset + 1] == key) {
			return offset + 1;
		}

		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100 };
		int key = 85;

		int result = fibonacciSearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
