package com.javacodepoint.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");

		System.out.println("Original List: " + names);

		// Sort the list
		Collections.sort(names);

		System.out.println("Sorted List: " + names);
	}
}
