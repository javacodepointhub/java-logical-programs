package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

public class RemoveSubstringStrings {

	// Method to remove strings that contain a specific substring
	public static List<String> removeStringsContainingSubstring(String[] words, String substring) {
		List<String> filteredWords = new ArrayList<>();

		for (String word : words) {
			if (!word.contains(substring)) {
				filteredWords.add(word);
			}
		}

		return filteredWords;
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "apple", "banana", "grape", "pineapple", "orange", "apricot" };
		String substring = "ap";

		// Remove strings containing the given substring
		List<String> filteredWords = removeStringsContainingSubstring(words, substring);

		// Print the result
		System.out.println("Filtered words: " + filteredWords);
	}
}
