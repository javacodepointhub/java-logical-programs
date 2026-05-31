package com.javacodepoint.sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort3 {
	public static void main(String[] args) {
		String[] names = { "John", "Alice", "Bob", "Diana" };

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(names));

		// Sort the array in reverse order
		Arrays.sort(names, Comparator.reverseOrder());

		System.out.println("Sorted Array (Reverse Order):");
		System.out.println(Arrays.toString(names));
	}
}
