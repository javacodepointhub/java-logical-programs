package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsByDelimiter {

	// Method to split each string by the delimiter and reconstruct the array
	public static String[] splitStrings(String[] words, String delimiter) {
		List<String> resultList = new ArrayList<>();

		for (String word : words) {
			String[] parts = word.split(delimiter); // Split the string
			resultList.addAll(Arrays.asList(parts)); // Add parts to the list
		}

		return resultList.toArray(new String[0]); // Convert list to array
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "apple-banana", "grape-mango", "peach-orange" };
		String delimiter = "-";

		// Split strings and reconstruct the array
		String[] result = splitStrings(words, delimiter);
		System.out.println("Reconstructed Array: " + Arrays.toString(result));
	}
}
