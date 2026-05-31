package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutocompleteSuggestions {

	// Method to get autocomplete suggestions
	public static List<String> getSuggestions(String[] words, String prefix) {
		List<String> suggestions = new ArrayList<>();

		for (String word : words) {
			if (word.startsWith(prefix)) {
				suggestions.add(word);
			}
		}

		// Sort the matching suggestions alphabetically
		Collections.sort(suggestions);

		return suggestions;
	}

	public static void main(String[] args) {
		// Example input
		String[] words = { "apple", "application", "ape", "banana", "appetizer", "apex" };
		String prefix = "app";

		// Get suggestions
		List<String> result = getSuggestions(words, prefix);

		// Print suggestions
		System.out.println("Suggestions: " + result);
	}
}
