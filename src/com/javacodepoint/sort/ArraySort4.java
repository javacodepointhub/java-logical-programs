package com.javacodepoint.sort;

import java.util.Arrays;

public class ArraySort4 {
	public static void main(String[] args) {
		int[] numbers = { 10, 5, 8, 20, 15 };

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(numbers));

		// Sort part of the array (index 1 to 4, exclusive of 4)
		Arrays.sort(numbers, 1, 4);

		System.out.println("Partially Sorted Array:");
		System.out.println(Arrays.toString(numbers));
	}
}
