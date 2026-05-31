package com.javacodepoint.programs;

public class PalindromeString2 {

	// Main method
	public static void main(String[] args) {

		// initializing a string to check string palindrome
		String str = "madam";

		// check palindrome
		if (isPalindromeString(str)) {
			System.out.println(str + " is a palindrome string.");
		} else {
			System.out.println(str + " is not a palindrome string.");
		}
	}

	// Palindrome checking method
	public static boolean isPalindromeString(String str) {

		boolean isPalindrome = true;

		// iterating the string upto the half of the string length
		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}

		//returning the result
		return isPalindrome;
	}

}
