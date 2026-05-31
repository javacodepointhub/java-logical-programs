package com.javacodepoint.string;

import java.util.Scanner;

public class SumOfDigitInString2 {

	// Method to calculate sum of digits
	public static int sumOfDigitInString(String str) {
		// initialize sum variable
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			// extract single character from string
			char ch = str.charAt(i);

			// check digit character
			if (Character.isDigit(ch)) {

				// convert character to digit and add into sum variable
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		// finally return the calculated sum
		return sum;
	}

	// Main method
	public static void main(String[] args) {

		// Scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string with digit characters: ");
		String stringWithDigit = sc.next();

		// Find the sum
		int sum = sumOfDigitInString(stringWithDigit);

		// Print the result
		System.out.println("The sum of total available digits in the given String= " + sum);

	}

}
