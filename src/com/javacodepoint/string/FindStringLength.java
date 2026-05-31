package com.javacodepoint.string;

import java.util.Scanner;

public class FindStringLength {

	public static void main(String[] args) {

		// Create scanner object to read user inputs
		Scanner sc = new Scanner(System.in);

		// Read a string from user
		System.out.println("Enter a string: ");
		String str = sc.next();

		// Declare a variable to find length
		int length = 0;

		// for-each loop
		for (char ch : str.toCharArray()) {
			// increment the count for each character
			length++;
		}

		// Print the length
		System.out.println("The length of the string (" + str + ") is: " + length);
	}

}
