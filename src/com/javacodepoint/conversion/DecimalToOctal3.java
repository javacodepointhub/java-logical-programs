package com.javacodepoint.conversion;

import java.util.Scanner;

public class DecimalToOctal3 {

	// Recursive method
	public static String convertDecimalToOctal(int decimal) {
		if (decimal == 0) {
			return "0";
		} else {
			return convertDecimalToOctal(decimal / 8) + (decimal % 8);
		}
	}

	// main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		String octal = convertDecimalToOctal(decimal);
		System.out.println("Octal equivalent: " + octal);
	}

}
