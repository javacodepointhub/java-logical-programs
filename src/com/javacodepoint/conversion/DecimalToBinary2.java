package com.javacodepoint.conversion;

import java.util.Scanner;

public class DecimalToBinary2 {

	public static String convertDecimalToBinary(int decimal) {
		StringBuilder binary = new StringBuilder();

		while (decimal > 0) {
			int remainder = decimal % 2;
			binary.insert(0, remainder);
			decimal = decimal / 2;
		}

		return binary.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		String binary = convertDecimalToBinary(decimal);
		System.out.println("Binary equivalent: " + binary);
	}
}
