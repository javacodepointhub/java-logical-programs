package com.javacodepoint.miscellaneous;

import java.util.Random;

public class GenerateRandomNo3 {

	// Generate random of specific length
	public static long generateRandom(int length) {

		// Create object of Random class
		Random random = new Random();

		// Create char array of given length
		char[] digits = new char[length];

		// Avoid first digit not to store value 0
		digits[0] = (char) (random.nextInt(9) + '1');

		// Storing remaining digits
		for (int i = 1; i < length; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		// Finally return the value
		return Long.parseLong(new String(digits));
	}

	public static void main(String[] args) {

		// Generating random numbers of specific length
		System.out.println("Random number of 3 digits => " + generateRandom(3));
		System.out.println("Random number of 5 digits => " + generateRandom(5));
		System.out.println("Random number of 10 digits => " + generateRandom(10));

	}

}
