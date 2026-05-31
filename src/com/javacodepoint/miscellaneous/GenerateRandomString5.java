package com.javacodepoint.miscellaneous;

import java.util.UUID;

/*
 * Generate Random Strings (UUID)
 */
public class GenerateRandomString5 {

	/*
	 * Generate random UUID
	 */
	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}

	public static void main(String[] args) {

		// Generate random UUIDs
		System.out.println("Random UUID Strings:");
		System.out.println("A random uuid String1 => " + generateUUID());
		System.out.println("A random uuid String2=> " + generateUUID());
		System.out.println("A random uuid String3=> " + generateUUID());

	}

}
