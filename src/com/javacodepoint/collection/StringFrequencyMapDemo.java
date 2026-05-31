package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFrequencyMapDemo {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("apple");
		strings.add("banana");
		strings.add("apple");
		strings.add("cherry");
		strings.add("banana");

		System.out.println("Original List: " + strings);

		// Creating a Map with string frequencies
		Map<String, Integer> frequencyMap = createStringFrequencyMap(strings);

		System.out.println("String Frequency Map: " + frequencyMap);
	}

	// Method to create a Map with string frequencies
	public static Map<String, Integer> createStringFrequencyMap(List<String> list) {
		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String str : list) {
			frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
		}

		return frequencyMap;
	}
}
