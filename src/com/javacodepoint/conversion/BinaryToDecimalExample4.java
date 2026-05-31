package com.javacodepoint.conversion;

import java.util.Scanner;

/**
 * Binary to Decimal conversion using Scanner.
 */
public class BinaryToDecimalExample4 {

	// method to convert binary to decimal
	public static int binaryToDecimal(int binary) {

		int decimal = 0;

		// Initialize base to 1, i.e 2^0
		int base = 1;
		while (binary > 0) {
			int lastDigit = binary % 10;
			decimal += lastDigit * base;
			base = base * 2;

			// remove the last digit
			binary = binary / 10;
		}
		return decimal;
	}

	// main method to test
	public static void main(String[] args) {

		// Create scanner object
		Scanner sc = new Scanner(System.in);

		// read binary number from user
		System.out.println("Enter a binary number:");
		int binary = sc.nextInt();
		System.out.println("Decimal Number of " + binary + " is: " + binaryToDecimal(binary));
	}

}
