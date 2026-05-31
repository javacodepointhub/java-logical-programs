package com.javacodepoint.miscellaneous;

import java.util.UUID;

public class GenerateUUID2 {

	/*
	 * Generate random UUID without the dashes
	 */
	public static String generateUUID() {
		
		// Generate UUID
		String uuid = UUID.randomUUID().toString();
		
		// Remove all dashes
		//uuid = uuid.replaceAll("-", "");
		
		return uuid;
	}

	public static void main(String[] args) {

		// Generate random UUIDs without the dashes
		System.out.println("Random UUID Strings without the dashes:");
		System.out.println("A random uuid String1 => " + generateUUID());
		System.out.println("A random uuid String2=> " + generateUUID());
		System.out.println("A random uuid String3=> " + generateUUID());

	}

}
