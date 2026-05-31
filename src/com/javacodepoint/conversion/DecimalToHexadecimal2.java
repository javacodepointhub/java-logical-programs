package com.javacodepoint.conversion;

import java.util.Scanner;

public class DecimalToHexadecimal2 {

	public static String convertDecimalToHexadecimal(int decimal) {
		StringBuilder hexadecimal = new StringBuilder();

		while (decimal > 0) {
			int remainder = decimal % 16;
			char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
			hexadecimal.insert(0, hexDigit);
			decimal = decimal / 16;
		}

		return hexadecimal.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		String hexadecimal = convertDecimalToHexadecimal(decimal);
		System.out.println("Hexadecimal equivalent: " + hexadecimal);
	}

}
