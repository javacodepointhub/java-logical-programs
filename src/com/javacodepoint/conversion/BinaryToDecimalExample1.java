package com.javacodepoint.conversion;

/**
 * Binary to Decimal conversion example, if binary number is in integer form.
 */
public class BinaryToDecimalExample1 {

	// method for binary to decimal
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
		System.out.println("Decimal Number of 1001 is: " + binaryToDecimal(1001));
		System.out.println("Decimal Number of 1111 is: " + binaryToDecimal(1111));
		System.out.println("Decimal Number of 1100110 is: " + binaryToDecimal(1100110));
		System.out.println("Decimal Number of 1000000001 is: " + binaryToDecimal(1000000001));
	}

}
