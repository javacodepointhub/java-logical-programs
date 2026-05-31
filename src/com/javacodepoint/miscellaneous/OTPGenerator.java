package com.javacodepoint.miscellaneous;

import java.util.Random;

public class OTPGenerator {

	// Generate integer OTP
	public static int generateOTP(int length) {

		int otp = 0;

		// Create object of Random class
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			// Generate a random digit from 0 to 9
			int digit = random.nextInt(10);

			// Concat the generated digit to otp
			otp = otp * 10 + digit;
		}

		// return final otp
		return otp;

	}

	// main method to test
	public static void main(String[] args) {

		// Generate multiple OTPs
		System.out.println("The 4 digits generated OTP is: " + generateOTP(4));
		System.out.println("The 6 digits generated OTP is: " + generateOTP(6));
		System.out.println("The 8 digits generated OTP is: " + generateOTP(8));

	}

}
