package com.javacodepoint.programs;

import java.util.Scanner;

public class CountGivenCharacter {

	// Main method
	public static void main(String[] args) {

		// String variable to take a string input from the user
		String str = null;

		char ch;
		int count = 0;

		// Creating scanner class object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string to count the given character: ");

		// reading the string input
		str = sc.next();

		System.out.println("Please enter a character to count: ");

		// reading the character input
		ch = sc.next().charAt(0);

		// iterate the string from beginning to end
		for (int i = 0; i < str.length(); i++) {

			if (ch == str.charAt(i)) {
				count++;
			}

		}

		// Printing the result
		System.out.println(ch + " => " + count +" times");

	}

}
