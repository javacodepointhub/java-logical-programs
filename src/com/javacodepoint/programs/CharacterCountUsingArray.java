package com.javacodepoint.programs;

import java.util.Scanner;

public class CharacterCountUsingArray {

	public static void main(String[] args) {
		// String variable to take a string input from the user
		String str = null;

		// count array to hold the character count
		int count[] = new int[26];

		// Creating scanner class object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string to count the characters: ");

		// reading the string input
		str = sc.next();

		// making string in lowercase
		str = str.toLowerCase();

		// iterate the string from beginning to end
		for (int i = 0; i < str.length(); i++) {

			// pick the character and convert in ASCII no
			int ch = (int) str.charAt(i);

			// 97 is the ascii value for a
			count[ch - 97] = count[ch - 97] + 1;

		}

		// Printing the final result
		for (int i = 0; i < count.length; i++) {
			int totalCount = count[i];
			
			//checking the character was present in string or not
			if (totalCount > 0) {
				char ch = (char) (97 + i);
				System.out.println(ch + " => " + totalCount);
			}
		}
	}

}
