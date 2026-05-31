package com.javacodepoint.string;

public class ReverseWordsInSentence {
	
	public static String reverseSentence(String input) {
		if (input == null || input.isEmpty()) {
			return input; // If the input is null or empty, return as it is.
		}

		// Split the input sentence into words
		String[] words = input.trim().split("\\s+");

		// Reverse the order of words
		StringBuilder reversedSentence = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversedSentence.append(words[i]);
			if (i > 0) {
				reversedSentence.append(" "); // Add space between words
			}
		}

		return reversedSentence.toString();
	}

	public static void main(String[] args) {
		String sentence = "This is a sample string sentence";
		String reversedSentence = reverseSentence(sentence);

		System.out.println("Input Sentence: " + sentence);
		System.out.println("Reversed Sentence: " + reversedSentence);
	}
}
