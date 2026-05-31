package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckVowelConsonant5 {

	public static void main(String[] args) {
		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		char ch = sc.next().charAt(0);

		// All Vowels (lowercase and uppercase)
		String allVowels = "aeiouAEIOU";

		// Check given character is an alphabet or not
		if (Character.isAlphabetic(ch)) {

			// Check the character available in allVowels
			if (allVowels.indexOf(ch) != -1) {
				System.out.println("The character " + ch + " is a Vowel.");
			} else {
				System.out.println("The character " + ch + " is a Consonant.");
			}
		} else {
			// Non-alphabet character
			System.out.println("Error! " + ch + " is a Non-alphabetic character.");
		}
	}

}
