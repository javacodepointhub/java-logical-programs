package com.javacodepoint.conversion;

/**
 * Binary to Decimal conversion example, if binary number is in string form.
 */
public class BinaryToDecimalExample2 {

	// method for binary to decimal
	public static int binaryToDecimal(String binary) {

		int decimal = 0;

		// initialize base to 1, i.e 2^0
		int base = 1;

		// loop the binary string in reverse way
		for (int i = binary.length() - 1; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				decimal += base;
			}
			// each time base will become doubled
			base = base * 2;
		}

		return decimal;
	}

	// main method to test
	public static void main(String[] args) {
		System.out.println("Decimal Number of 1001 is: " + binaryToDecimal("1001"));
		System.out.println("Decimal Number of 1111 is: " + binaryToDecimal("1111"));
		System.out.println("Decimal Number of 1100110 is: " + binaryToDecimal("1100110"));
		System.out.println("Decimal Number of 1000000001 is: " + binaryToDecimal("1000000001"));
	}

}
