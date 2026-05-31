package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

public class StringsContainingSubstring {

	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "apple", "banana", "grape", "pineapple" };
		String substring = "apple";

		// Call the method to find strings containing the substring
		List<String> containingStrings = findStringsContainingSubstring(words, substring);

		// Display the results
		System.out.println(
				"Strings containing the substring \"" + substring + "\": " + String.join(", ", containingStrings));
	}

	// Method to find strings containing a specific substring
	public static List<String> findStringsContainingSubstring(String[] words, String substring) {
		List<String> result = new ArrayList<>();

		// Check each string in the array
		for (String word : words) {
			if (word.contains(substring)) {
				result.add(word);
			}
		}

		return result;
	}
}