package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListFindDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);

		List<Integer> duplicateNumbers = findDuplicates(numbers);

		System.out.println("Original List: " + numbers);
		System.out.println("Duplicate Numbers: " + duplicateNumbers);
	}

	// Method to find duplicate elements in an ArrayList
	public static <T> List<T> findDuplicates(List<T> list) {
		List<T> duplicates = new ArrayList<>();
		Map<T, Integer> elementCountMap = new HashMap<>();

		for (T element : list) {
			elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
		}

		for (Map.Entry<T, Integer> entry : elementCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}

		return duplicates;
	}
}
