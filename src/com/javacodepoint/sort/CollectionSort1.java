package com.javacodepoint.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort1 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 8, 1, 7);

		System.out.println("Original List: " + numbers);

		// Sort the list
		Collections.sort(numbers);

		System.out.println("Sorted List: " + numbers);
	}
}
