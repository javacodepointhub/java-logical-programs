package com.javacodepoint.string;

public class WordCount {
	
	public static int countWords(String input) {
		if (input == null || input.isEmpty()) {
			return 0; // If the input is null or empty, return 0 words.
		}

		int wordCount = 0;
		boolean inWord = false;

		// Iterate through the characters in the input string
		for (char c : input.toCharArray()) {
			if (Character.isWhitespace(c)) {
				// If a whitespace character is found, mark the end of a word
				inWord = false;
			} else {
				// If a non-whitespace character is found, check if it's the start of a new word
				if (!inWord) {
					wordCount++;
					inWord = true;
				}
			}
		}

		return wordCount;
	}

	public static void main(String[] args) {
		String str = "   Hello,  World! This is a   sample string example.   ";
		int wordCount = countWords(str);

		System.out.println("Input String: " + str);
		System.out.println("Number of words: " + wordCount);
	}
}
