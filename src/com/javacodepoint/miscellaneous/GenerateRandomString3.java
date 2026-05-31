package com.javacodepoint.miscellaneous;

/*
 * Generate Random Strings
 */
public class GenerateRandomString3 {

	/*
	 * Generate alpha-numeric string, without starting with number
	 */
	public static String generateRandom(int length) {

		// Total 62 characters (Alphabets in lower/upper case and Numbers)
		String allAlphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		// Declare a variable to hold random String
		String randomId = "";

		// Pick first alphabet character only
		randomId += allAlphaNumeric.charAt((int) Math.floor(52 * Math.random()));

		// Start loop from 1
		for (int i = 1; i < length; i++) {

			// Generate random integer in range 0 to 61
			int randomIndex = (int) Math.floor(62 * Math.random());

			// Get specified character and concat to randomId
			randomId += allAlphaNumeric.charAt(randomIndex);
		}

		// Finally return the randomId
		return randomId;
	}

	public static void main(String[] args) {

		// Generate alpha-numeric strings but should not starts with number
		System.out.println("Alpha-Numeric Random Strings without starting with a number:");
		System.out.println("A random string of 5 Characters => " + generateRandom(5));
		System.out.println("A random string of 10 Characters => " + generateRandom(10));
		System.out.println("A random string of 20 Characters => " + generateRandom(20));

	}

}
