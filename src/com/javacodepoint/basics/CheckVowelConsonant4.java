package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckVowelConsonant4 {

	public static void main(String[] args) {
		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		char ch = sc.next().charAt(0);

		if (!Character.isAlphabetic(ch)) {
			// Non-alphabet character
			System.out.println("Error! Non-alphabetic character.");
			return;
		}

		boolean isVowel = false;

		// Check vowel using switch case
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;
		}

		// Print the result
		if (isVowel) {
			System.out.println("The given character is a Vowel.");
		} else {
			System.out.println("The given character is a Consonant.");
		}

	}

}
