package com.javacodepoint.string;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		// Creating scanner object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to count Vowels: ");
		String str = sc.next();

		// Variable to count the vowel characters
		int vowelsCount = 0;

		// Iterate over the given string
		for (int i = 0; i < str.length(); i++) {

			// Extract a character from string
			char ch = str.charAt(i);

			// Check Vowel character
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vowelsCount++;
			}
		}

		// Print the count
		System.out.println("The total vowels count: " + vowelsCount);

	}

}
