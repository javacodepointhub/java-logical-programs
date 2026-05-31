package com.javacodepoint.string;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	public static String removeDuplicates(String input) {
		if (input == null || input.isEmpty()) {
			return input; // If the input is null or empty, return as it is.
		}

		// Use a LinkedHashSet to maintain the order of unique characters while removing
		// duplicates
		LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

		// Iterate through the string and add each character to the LinkedHashSet
		for (char c : input.toCharArray()) {
			uniqueChars.add(c);
		}

		// Build a new string from the unique characters in the LinkedHashSet
		StringBuilder result = new StringBuilder();
		for (char c : uniqueChars) {
			result.append(c);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String inputString = "exampletext";
		String withoutDuplicates = removeDuplicates(inputString);

		System.out.println("Original String: " + inputString);
		System.out.println("String without duplicates: " + withoutDuplicates);
	}
}