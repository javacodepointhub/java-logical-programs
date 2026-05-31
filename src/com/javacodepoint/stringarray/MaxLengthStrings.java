package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

public class MaxLengthStrings {
	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "apple", "banana", "cherry", "dragonfruit" };

		// Call the method to find maximum length strings
		List<String> maxLengthStrings = findMaxLengthStrings(words);

		// Display the results
		System.out.println("The string(s) with the maximum length: " + maxLengthStrings);
	}

	// Method to find strings with the maximum length in an array
	public static List<String> findMaxLengthStrings(String[] words) {
		List<String> result = new ArrayList<>();
		int maxLength = 0;

		// Find the maximum length
		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
			}
		}

		// Collect strings with the maximum length
		for (String word : words) {
			if (word.length() == maxLength) {
				result.add(word);
			}
		}

		return result;
	}
}