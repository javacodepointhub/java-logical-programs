package com.javacodepoint.miscellaneous;

/*
 * Generate Random Strings
 */
public class GenerateRandomString {

	/*
	 * Generate random alphabetic String
	 */
	public static String generateRandom(int length) {

		// Total 52 characters (Alphabets in lower/upper case)
		String allAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		// Declare a variable to hold random String
		String randomId = "";

		for (int i = 0; i < length; i++) {

			// Generate random integer in range 0 to 51
			int randomIndex = (int) Math.floor(52 * Math.random());

			// Get specified character and concat to randomId
			randomId += allAlpha.charAt(randomIndex);
		}

		// Finally return the randomId
		return randomId;
	}

	public static void main(String[] args) {

		// Generate alphabetic strings of specific length
		System.out.println("Alphabetic Random Strings:");
		System.out.println("A random string of 5 Characters => " + generateRandom(5));
		System.out.println("A random string of 10 Characters => " + generateRandom(10));
		System.out.println("A random string of 20 Characters => " + generateRandom(20));

	}

}
