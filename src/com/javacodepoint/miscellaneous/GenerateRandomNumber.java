package com.javacodepoint.miscellaneous;

import java.util.Random;

public class GenerateRandomNumber {

	public static int generateRandom() {

		// Create object of Random class
		Random random = new Random();

		// Here nextInt() generate integer in range 0 to 9999
		// so adding +1 to generated value;
		int number = random.nextInt(10000) + 1;

		return number;
	}

	public static void main(String[] args) {

		// Generating random numbers from 1 to 10,000
		System.out.println("Random number1 => " + generateRandom());
		System.out.println("Random number2 => " + generateRandom());
		System.out.println("Random number3 => " + generateRandom());

	}

}
