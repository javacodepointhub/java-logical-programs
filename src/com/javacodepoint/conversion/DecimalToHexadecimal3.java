package com.javacodepoint.conversion;

import java.util.Scanner;

public class DecimalToHexadecimal3 {

	public static String convertDecimalToHexadecimal(int decimal) {
		if (decimal == 0) {
			return "0";
		} else {
			int remainder = decimal % 16;
			char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
			return convertDecimalToHexadecimal(decimal / 16) + hexDigit;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		String hexadecimal = convertDecimalToHexadecimal(decimal);
		System.out.println("Hexadecimal equivalent: " + hexadecimal);
	}

}
