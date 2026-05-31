package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckVowelConsonant6 {

	public static void main(String[] args) {
		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		char ch = sc.next().charAt(0);

		// Check whether a character is Vowel or not
		boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
				|| ch == 'I' || ch == 'O' || ch == 'U') ? true : false;

		// Print the result
		if (isVowel)
			System.out.println("The given character is a Vowel.");
		else
			System.out.println("The given character is a Consonant.");

	}

}
