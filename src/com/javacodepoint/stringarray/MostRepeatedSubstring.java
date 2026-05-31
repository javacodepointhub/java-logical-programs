package com.javacodepoint.stringarray;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedSubstring {

	// Method to find the most repeated substring
	public static String findMostRepeatedSubstring(String[] strings) {
		Map<String, Integer> substringCount = new HashMap<>();

		for (String str : strings) {
			int len = str.length();
			// Generate all possible substrings of each string
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j <= len; j++) {
					String sub = str.substring(i, j);
					if (sub.length() > 1) { // ignoring single-character substrings
						substringCount.put(sub, substringCount.getOrDefault(sub, 0) + 1);
					}
				}
			}
		}

		// Find the substring with the highest frequency
		String mostRepeated = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : substringCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostRepeated = entry.getKey();
			}
		}

		return mostRepeated;
	}

	public static void main(String[] args) {
		String[] input = { "banana", "bandana", "anagram" };

		String result = findMostRepeatedSubstring(input);
		System.out.println("Most Repeated Substring: " + result);
	}
}
