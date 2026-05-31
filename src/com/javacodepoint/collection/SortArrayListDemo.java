package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);

		System.out.println("Original List: " + numbers);

		// Sorting the ArrayList
		Collections.sort(numbers);

		System.out.println("Sorted List: " + numbers);
	}
}
