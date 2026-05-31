package com.javacodepoint.generator;

import java.util.Random;

/*
 * OTP Generator using Random class
 */
public class OTPGenerator {

	// method to generate OTP of given length
	public static String generateOTP(int length) {

		// All numbers
		String numbers = "0123456789";

		// Using Random class
		Random random = new Random();

		// char array to store the opt numbers
		char[] otp = new char[length];

		for (int i = 0; i < length; i++) {
			// Using charAt() method to get character value
			// Using nextInt(), it gives number between 0 to 9
			otp[i] = numbers.charAt(random.nextInt(10));
		}

		return new String(otp);
	}

	// method to generate OTP of given length
	public static String genOTP(int length) {

		// Using Random class
		Random random = new Random();

		// char array to store the opt numbers
		String otp = "";

		for (int i = 0; i < length; i++) {
			// Using charAt() method to get character value
			// Using nextInt(), it gives number between 0 to 9
			otp += random.nextInt(10);
		}

		return otp;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Generate random OTPs:");
		System.out.println("The 4 digits OTP: " + generateOTP(4));
		System.out.println("The 4 digits OTP: " + generateOTP(4));
		System.out.println("The 6 digits OTP: " + generateOTP(6));
		System.out.println("The 6 digits OTP: " + genOTP(6));
	}

}
