package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckVowelConsonant {

	public static void main(String[] args) {
		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		char ch = sc.next().charAt(0);

		// Check Vowel or Consonant
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("The given character is a Vowel.");
		} else {
			System.out.println("The given character is a Consonant.");
		}

	}

}
