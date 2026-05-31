package com.javacodepoint.miscellaneous;

import java.util.Random;

public class GenerateRandomNo2 {

	// Generate random in specific range
	public static int generateRandom(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value should be less than max");
		}

		// Create object of Random class
		Random random = new Random();

		// Generate integer of max
		int number = random.nextInt(max) + 1;

		// Add min value to number if it is less
		if (number < min) {
			number += min;
		}
		return number;
	}

	public static void main(String[] args) {

		// Generating random numbers in specific range
		System.out.println("Random number between 10-20 => " + generateRandom(10, 20));
		System.out.println("Random number between 50-100 => " + generateRandom(50, 100));
		System.out.println("Random number between 1000-5000 => " + generateRandom(1000, 5000));

	}

}
