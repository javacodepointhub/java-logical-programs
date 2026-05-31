package com.javacodepoint.conversion;

/**
 * Binary to Decimal conversion example, using parseInt() method.
 */
public class BinaryToDecimalExample3 {

	public static void main(String[] args) {
		System.out.println("Decimal Number of 101 is: " + java.lang.Integer.parseInt("101", 2));
		System.out.println("Decimal Number of 1010101 is: " + Integer.parseInt("1010101", 2));
		System.out.println("Decimal Number of 1000111 is: " + Integer.parseInt("1000111", 2));
		System.out.println("Decimal Number of 1000000001 is: " + Integer.parseInt("1000000001", 2));
	}

}
