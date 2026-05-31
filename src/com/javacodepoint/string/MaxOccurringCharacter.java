package com.javacodepoint.string;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
	
	public static char findMaxOccurringChar(String input) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("Input string is null or empty.");
		}

		// Create a HashMap to store character frequencies
		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		// Convert the input string to lowercase to make it case-insensitive
		input = input.toLowerCase();

		// Iterate through the string and count the occurrences of each character
		for (char c : input.toCharArray()) {
			// Ignore non-alphabetic characters, you can modify this condition based on your
			// requirements
			if (Character.isAlphabetic(c)) {
				charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
			}
		}

		// Find the maximum occurring character and its frequency
		char maxChar = '\0'; // Initialize maxChar to a null character
		int maxFrequency = 0;

		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			int frequency = entry.getValue();
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
				maxChar = entry.getKey();
			}
		}

		return maxChar;
	}

	public static void main(String[] args) {
		String inputString = "Javacodepoint";
		char maxChar = findMaxOccurringChar(inputString);

		System.out.println("Maximum occurring character: " + maxChar);
	}
}