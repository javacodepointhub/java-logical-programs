package com.javacodepoint.string;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString2 {
	
	public static String removeDuplicates(String input) {
		if (input == null || input.isEmpty()) {
			return input; // If the input is null or empty, return as it is.
		}

		StringBuilder result = new StringBuilder();
		boolean[] visitedChars = new boolean[256]; // Assuming ASCII characters (0 to 255)

		for (char c : input.toCharArray()) {
			if (!visitedChars[c]) {
				result.append(c);
				visitedChars[c] = true;
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String inputString = "Javacodepoint";
		String withoutDuplicates = removeDuplicates(inputString);

		System.out.println("Original String: " + inputString);
		System.out.println("String without duplicates: " + withoutDuplicates);
	}
}