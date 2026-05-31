package com.javacodepoint.miscellaneous;
/*
 * Generate OTP using Math.random()
 */
public class GenerateOTP {

	// generate string otp
	public static String generateOTP() {
		// declare randomNo to store the otp
		// generate 4 digits otp
		int randomNo = (int) (Math.random() * 9000) + 1000;
		String otp = String.valueOf(randomNo);
		// return otp
		return otp;
	}

	// main method to test
	public static void main(String[] args) {
		System.out.println("Generate OTP (One Time Password),");
		String otp = generateOTP();
		System.out.println("4 digits OTP: " + otp);
	}

}
