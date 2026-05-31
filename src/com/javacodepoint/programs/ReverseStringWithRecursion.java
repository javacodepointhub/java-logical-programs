package com.javacodepoint.programs;

import java.util.Scanner;

public class ReverseStringWithRecursion {

	public static void main(String[] args) {

		// String variable to take a string input from the user
		String str = null;

		// Creating scanner class object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string to reverse: ");

		// reading the string input
		str = sc.next();
		
		//Final output
		System.out.println("Reverse of the given string is "+reverseString(str));

	}

	// Recursive method
	public static String reverseString(String str) {

		// return empty when string is empty
		if (str.equals("")) {
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
