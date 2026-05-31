package com.javacodepoint.conversion;

import java.util.Scanner;

public class DecimalToBinary3 {

	// Recursive method
	public static String convertDecimalToBinary(int decimal) {
		if (decimal == 0) {
			return "0";
		} else if (decimal == 1) {
			return "1";
		} else {
			return convertDecimalToBinary(decimal / 2) + (decimal % 2);
		}
	}

	// main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		String binary = convertDecimalToBinary(decimal);
		System.out.println("Binary equivalent: " + binary);
	}
}
