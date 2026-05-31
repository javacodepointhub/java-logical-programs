package com.javacodepoint.conversion;

import java.util.Scanner;

public class DecimalToOctal2 {

	public static String convertDecimalToOctal(int decimal) {
		StringBuilder octal = new StringBuilder();

		while (decimal > 0) {
			int remainder = decimal % 8;
			octal.insert(0, remainder);
			decimal = decimal / 8;
		}

		return octal.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		String octal = convertDecimalToOctal(decimal);
		System.out.println("Octal equivalent: " + octal);
	}

}
