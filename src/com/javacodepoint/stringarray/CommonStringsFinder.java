package com.javacodepoint.stringarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonStringsFinder {

	// Method to find common strings using HashSet
	public static String[] findCommonStrings(String[] array1, String[] array2) {
		Set<String> set1 = new HashSet<>(Arrays.asList(array1));
		Set<String> commonStrings = new HashSet<>();

		for (String word : array2) {
			if (set1.contains(word)) {
				commonStrings.add(word);
			}
		}

		return commonStrings.toArray(new String[0]); // Convert Set to Array
	}

	public static void main(String[] args) {
		String[] array1 = { "apple", "banana", "grape", "orange" };
		String[] array2 = { "mango", "banana", "apple", "peach" };

		// Find and print common strings
		String[] commonWords = findCommonStrings(array1, array2);
		System.out.println("Common Strings: " + Arrays.toString(commonWords));
	}
}
