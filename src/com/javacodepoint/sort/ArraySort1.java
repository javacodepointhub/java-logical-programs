package com.javacodepoint.sort;

import java.util.Arrays;

public class ArraySort1 {
	public static void main(String[] args) {
		int[] numbers = { 5, 1, 12, -5, 16 };

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(numbers));

		// Sort the array
		Arrays.sort(numbers);

		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(numbers));
	}
}
