package com.javacodepoint.stringarray;

public class LongestCommonPrefix {
	
	// Method to find the longest common prefix among all strings in an array
	public static String findLongestCommonPrefix(String[] words) {
		if (words == null || words.length == 0) {
			return "";
		}

		String prefix = words[0];

		for (int i = 1; i < words.length; i++) {
			while (words[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "flower", "flow", "flight" };

		// Find and print the longest common prefix
		String longestPrefix = findLongestCommonPrefix(words);
		System.out.println("Longest Common Prefix: " + longestPrefix);
	}
}
