package com.javacodepoint.stringarray;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CommonStringsBruteForce {

	// Method to find common strings using nested loops
	public static String[] findCommonStrings(String[] array1, String[] array2) {
		List<String> commonStrings = new ArrayList<>();

		for (String word1 : array1) {
			for (String word2 : array2) {
				if (word1.equals(word2)) { // Check if both words are the same
					if (!commonStrings.contains(word1)) { // Avoid duplicates
						commonStrings.add(word1);
					}
				}
			}
		}

		return commonStrings.toArray(new String[0]); // Convert List to Array
	}

	public static void main(String[] args) {
		String[] array1 = { "apple", "banana", "grape", "orange" };
		String[] array2 = { "mango", "banana", "apple", "peach" };

		// Find and print common strings
		String[] commonWords = findCommonStrings(array1, array2);
		System.out.println("Common Strings: " + Arrays.toString(commonWords));
	}
}
