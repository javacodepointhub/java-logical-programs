package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesPreserveOrderDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);

		System.out.println("Original List: " + numbers);

		// Removing duplicates while preserving order
		List<Integer> uniqueNumbers = removeDuplicatesPreserveOrder(numbers);

		System.out.println("List after removing duplicates: " + uniqueNumbers);
	}

	// Method to remove duplicates while preserving order
	public static <T> List<T> removeDuplicatesPreserveOrder(List<T> list) {
		HashSet<T> seen = new LinkedHashSet<>();
		List<T> uniqueList = new ArrayList<>();

		for (T element : list) {
			if (seen.add(element)) {
				uniqueList.add(element);
			}
		}

		return uniqueList;
	}
}
