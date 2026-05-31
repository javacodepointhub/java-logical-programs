package com.javacodepoint.stringarray;

public class ConcatenateStrings {

	// Method to concatenate strings with a delimiter
	public static String concatenateWithDelimiter(String[] words, String delimiter) {
		if (words == null || words.length == 0) {
			return "";
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			result.append(words[i]); // Append the word

			if (i < words.length - 1) { // Add delimiter except for the last word
				result.append(delimiter);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "apple", "banana", "grape", "orange" };
		String delimiter = ", ";

		// Concatenate and print the result
		String result = concatenateWithDelimiter(words, delimiter);
		System.out.println("Concatenated String: " + result);
	}
}
