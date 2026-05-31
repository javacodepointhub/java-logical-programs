package com.javacodepoint.array.basic;

import java.util.Scanner;
import java.util.stream.IntStream;

//Get Array Input Using Streams
public class StreamArrayInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take input size
		System.out.print("Enter size of the array: ");
		int size = scanner.nextInt();

		// Input array elements using streams
		int[] numbers = IntStream.range(0, size).map(i -> {
			System.out.print("Enter element " + (i + 1) + ": ");
			return scanner.nextInt();
		}).toArray();

		// Print the array elements
		System.out.println("Array elements:");
		IntStream.of(numbers).forEach(num -> System.out.print(num + " "));
	}
}
