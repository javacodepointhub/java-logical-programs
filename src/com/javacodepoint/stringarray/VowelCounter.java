package com.javacodepoint.stringarray;

public class VowelCounter {
	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "hello", "world", "java", "programming" };

		// Loop through each word in the array
		for (String word : words) {
			int vowelCount = countVowels(word);
			System.out.println("The word \"" + word + "\" contains " + vowelCount + " vowels.");
		}
	}

	// Method to count vowels in a string
	public static int countVowels(String word) {
		int count = 0;
		String vowels = "aeiouAEIOU"; // Vowels in both lowercase and uppercase

		// Check each character in the string
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
				count++;
			}
		}
		return count;
	}
}
