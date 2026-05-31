package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckVowelConsonant3 {

	public static void main(String[] args) {
		
		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		char ch = sc.next().charAt(0);

		if (!Character.isAlphabetic(ch)) {
			// Non-alphabet character
			System.out.println("Error! Non-alphabetic character.");
		} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			// Vowel
			System.out.println("The given character is a Vowel.");
		} else {
			// Consonant
			System.out.println("The given character is a Consonant.");
		}

	}

}
