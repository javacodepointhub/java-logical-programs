package com.javacodepoint.array.basic;

import java.util.Scanner;

public class GCDofNNumbers {
	// Function to find GCD of two numbers
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// Function to find GCD of an array of numbers
	public static int findGCDofArray(int[] numbers) {
		int gcd = numbers[0]; // Start with the first number
		for (int i = 1; i < numbers.length; i++) {
			gcd = findGCD(gcd, numbers[i]);
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		// Input the array elements
		int[] numbers = new int[n];
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Find and print the GCD
		int gcd = findGCDofArray(numbers);
		System.out.println("The GCD of the given numbers is: " + gcd);
	}
}
