package com.javacodepoint.string;

public class WordCount2 {

	public static int countWords(String input) {
		if (input == null || input.trim().isEmpty()) {
			return 0; // If the input is null, empty, or contains only whitespace, return 0 words.
		}

		// Split the input string using whitespace as the delimiter
		String[] words = input.trim().split("\\s+");

		// Return the number of words in the array
		return words.length;
	}

	public static void main(String[] args) {
		String str = "This is a sample string example.";
		int wordCount = countWords(str);

		System.out.println("Input String: " + str);
		System.out.println("Number of words: " + wordCount);
	}
}
