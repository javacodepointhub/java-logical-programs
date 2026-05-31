package com.javacodepoint.miscellaneous;

import java.util.Scanner;
/*
 * Simple example of a secret message program that 
 * encrypts and decrypts a message using a simple Caesar cipher.
 */
public class SecretMessageProgram {
	
	public static String encrypt(String message, int shift) {
		StringBuilder encryptedMessage = new StringBuilder();

		for (char ch : message.toCharArray()) {
			if (Character.isLetter(ch)) {
				char base = Character.isUpperCase(ch) ? 'A' : 'a';
				char encryptedChar = (char) (base + (ch - base + shift) % 26);
				encryptedMessage.append(encryptedChar);
			} else {
				encryptedMessage.append(ch);
			}
		}

		return encryptedMessage.toString();
	}

	public static String decrypt(String encryptedMessage, int shift) {
		return encrypt(encryptedMessage, 26 - shift);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a message: ");
		String message = scanner.nextLine();

		System.out.print("Enter a shift value (0-25): ");
		int shift = scanner.nextInt();

		String encryptedMessage = encrypt(message, shift);
		System.out.println("Encrypted Message: " + encryptedMessage);

		String decryptedMessage = decrypt(encryptedMessage, shift);
		System.out.println("Decrypted Message: " + decryptedMessage);

		scanner.close();
	}
}
