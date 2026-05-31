package com.javacodepoint.conversion;

/**
 * Binary to Decimal conversion using Recursion.
 */
public class BinaryToDecimalRecursion2 {

	// recursive method for binary to decimal
	public static int binaryToDecimal(String binary, int i) {

		int length = binary.length();

		// if we reached to last character
		if (i == length - 1) {
			return binary.charAt(i) - '0';
		}

		// add current term and recursion for
		// remaining terms
		return ((binary.charAt(i) - '0') << (length - i - 1)) + binaryToDecimal(binary, i + 1);
	}

	// main method
	public static void main(String[] args) {

		// Binary number is in string format
		System.out.println("Decimal Number of 101 is: " + binaryToDecimal("101", 0));
		System.out.println("Decimal Number of 1010 is: " + binaryToDecimal("1010", 0));
		System.out.println("Decimal Number of 1111000 is: " + binaryToDecimal("1111000", 0));
		System.out.println("Decimal Number of 1000000001 is: " + binaryToDecimal("1000000001", 0));
	}

}
