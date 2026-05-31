package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

public class NumericStrings {

	// Method to check if a string contains only numeric characters
	public static boolean isNumeric(String str) {
		return str.matches("\\d+"); // Regular expression to check if the string contains only digits
	}

	// Method to identify numeric strings in an array
	public static List<String> findNumericStrings(String[] words) {
		List<String> numericStrings = new ArrayList<>();

		for (String word : words) {
			if (isNumeric(word)) {
				numericStrings.add(word);
			}
		}

		return numericStrings;
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "123", "hello", "4567", "world", "8901", "java123" };

		// Find and print numeric strings
		List<String> numericStrings = findNumericStrings(words);
		System.out.println("Numeric strings: " + numericStrings);
	}
}
