package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharacterStrings {

	// Method to check if a string has all unique characters
	public static boolean hasUniqueCharacters(String str) {
		Set<Character> seenChars = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (!seenChars.add(ch)) { // If add() returns false, character is duplicate
				return false;
			}
		}
		return true;
	}

	// Method to find all strings with unique characters in an array
	public static List<String> findUniqueCharacterStrings(String[] words) {
		List<String> uniqueStrings = new ArrayList<>();

		for (String word : words) {
			if (hasUniqueCharacters(word)) {
				uniqueStrings.add(word);
			}
		}
		return uniqueStrings;
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "hello", "world", "abc", "unique", "java", "coder" };

		// Find and print unique character strings
		List<String> uniqueStrings = findUniqueCharacterStrings(words);
		System.out.println("Strings with unique characters: " + uniqueStrings);
	}
}
