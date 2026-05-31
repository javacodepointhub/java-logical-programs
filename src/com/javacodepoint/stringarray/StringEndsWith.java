package com.javacodepoint.stringarray;

public class StringEndsWith {
	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "apple", "banana", "cherry", "date" };
		char targetChar = 'e';

		// Loop through each word in the array
		for (String word : words) {
			if (word.endsWith(String.valueOf(targetChar))) {
				System.out.println("The word \"" + word + "\" ends with '" + targetChar + "'.");
			}
		}
	}
}
