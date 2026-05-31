package com.javacodepoint.string;

import java.util.Scanner;

public class CountVowels2 {

	public static void main(String[] args) {

		// Creating scanner object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to count Vowels: ");
		String str = sc.next();

		// Variable to count the total Vowel characters
		int vowelsCount = 0;

		// All Vowels (lowercase and uppercase)
		String allVowels = "aeiouAEIOU";

		// Iterate over the given string
		for (int i = 0; i < str.length(); i++) {

			// Extract a character from string
			char ch = str.charAt(i);

			// Check Vowel character
			if (allVowels.indexOf(ch) != -1) {
				vowelsCount++;
			}
		}

		// Print the count
		System.out.println("The total vowels count: " + vowelsCount);

	}

}
