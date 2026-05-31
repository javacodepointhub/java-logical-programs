package com.javacodepoint.array.basic;

// Get Array Input Using Command-Line Arguments
public class CommandLineArrayInput {
	public static void main(String[] args) {
		// Length of args represents the number of command-line inputs
		int[] numbers = new int[args.length];

		// Convert String inputs to integers
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}

		// Print the array elements
		System.out.println("Array elements:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
