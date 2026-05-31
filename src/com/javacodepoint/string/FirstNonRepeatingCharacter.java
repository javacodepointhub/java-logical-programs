package com.javacodepoint.string;

import java.util.HashMap;
import java.util.Map;
/*
 * Find the first non-repeating character in a given string
 */
public class FirstNonRepeatingCharacter {
	
	public static char findFirstNonRepeatingCharacter(String str) {
		Map<Character, Integer> charFrequency = new HashMap<>();

		// Populate the frequency map
		for (char c : str.toCharArray()) {
			charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
		}

		// Find the first non-repeating character
		for (char c : str.toCharArray()) {
			if (charFrequency.get(c) == 1) {
				return c;
			}
		}

		// If no non-repeating character is found, return a placeholder value
		return '\0';
	}

	public static void main(String[] args) {
		String input = "javacodepoint";
		char firstNonRepeating = findFirstNonRepeatingCharacter(input);

		if (firstNonRepeating != '\0') {
			System.out.println("First non-repeating character: " + firstNonRepeating);
		} else {
			System.out.println("No non-repeating character found.");
		}
	}
}
