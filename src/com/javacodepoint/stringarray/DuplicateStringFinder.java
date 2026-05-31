package com.javacodepoint.stringarray;

import java.util.HashMap;

public class DuplicateStringFinder {
	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "apple", "banana", "apple", "orange", "banana", "apple" };

		// Call the method to find duplicates
		findDuplicates(words);
	}

	// Method to find and count duplicate strings in an array
	public static void findDuplicates(String[] words) {
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Populate the HashMap with word counts
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		// Identify and display duplicates
		for (String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			if (count > 1) {
				System.out.println("Duplicate string \"" + word + "\" appears " + count + " times.");
			}
		}
	}
}
