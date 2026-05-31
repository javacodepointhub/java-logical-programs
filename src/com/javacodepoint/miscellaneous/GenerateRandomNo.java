package com.javacodepoint.miscellaneous;

/*
 * Generate random numbers using Math.random() method
 */
public class GenerateRandomNo {

	public static int generateRandom() {

		// Here nextInt() generate integer in range 0 to 9999
		// so adding +1 to generated value;
		//int number = (int) (Math.random() * 9999);
		int number = (int) (.9999 * 10000);
		return number;
	}

	public static void main(String[] args) {

		// Generating random numbers from 1 to 10,000
		System.out.println("Random number1 => " + generateRandom());
		System.out.println("Random number2 => " + generateRandom());
		System.out.println("Random number3 => " + generateRandom());

	}

}
