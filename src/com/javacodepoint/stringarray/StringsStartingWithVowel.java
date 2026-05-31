package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

public class StringsStartingWithVowel {

	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "apple", "banana", "orange", "umbrella", "grape" };

		// Call the method to find strings starting with a vowel
		List<String> vowelStartStrings = findStringsStartingWithVowel(words);

		// Display the results
		System.out.println("Strings starting with a vowel: " + String.join(", ", vowelStartStrings));
	}

	// Method to find strings starting with a vowel
	public static List<String> findStringsStartingWithVowel(String[] words) {
		List<String> result = new ArrayList<>();
		String vowels = "aeiouAEIOU";

		// Check each string in the array
		for (String word : words) {
			if (!word.isEmpty() && vowels.indexOf(word.charAt(0)) != -1) {
				result.add(word);
			}
		}

		return result;
	}
}
