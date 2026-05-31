package com.javacodepoint.array.basic;

import java.util.Arrays;
import java.util.Scanner;

//Get Array Input Using Arrays Class and a Single Line Input
public class ArraysClassInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take a single line of input
		System.out.println("Enter array elements (space-separated):");
		String input = scanner.nextLine();

		// Convert input into an array
		int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

		// Print the array elements
		System.out.println("Array elements: " + Arrays.toString(numbers));
	}
}
