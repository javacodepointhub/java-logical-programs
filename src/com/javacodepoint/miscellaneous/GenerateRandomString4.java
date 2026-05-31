package com.javacodepoint.miscellaneous;

/*
 * Generate Random Strings
 */
public class GenerateRandomString4 {

	/*
	 * Generate random string in <OD_XXXXXXXXXX> Pattern
	 */
	public static String generateOrderId() {
		String orderId = "OD_";
		for (int i = 0; i < 10; i++) {

			// Generate random integer in range 0 to 9
			orderId += (int) Math.floor(10 * Math.random());
		}
		return orderId;
	}

	/*
	 * Generate random string in <TXN-XXXXXXXXXXXXXXX> Pattern
	 */
	public static String generateTransactionId() {
		String transacrionId = "TXN-" + generateRandom(15);
		return transacrionId;
	}

	/*
	 * Generate random string in specific length
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

		// Generate random string in some patterns
		System.out.println("Random order ids in Pattern (OD_XXXXXXXXXX):");
		System.out.println("A random order id1 => " + generateOrderId());
		System.out.println("A random order id2 => " + generateOrderId());
		System.out.println("A random order id3 => " + generateOrderId());

		System.out.println("Random transaction ids in Pattern (TXN-XXXXXXXXXXXXXXX):");
		System.out.println("A random transaction id1 => " + generateTransactionId());
		System.out.println("A random transaction id2 => " + generateTransactionId());
		System.out.println("A random transaction id3 => " + generateTransactionId());

	}

}
