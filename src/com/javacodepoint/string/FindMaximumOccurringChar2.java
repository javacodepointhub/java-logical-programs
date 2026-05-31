package com.javacodepoint.string;

/*
 * Find maximum occurring character using Array
 */
public class FindMaximumOccurringChar2 {

	// method to find maximum occurring character
	static char findMaxOccurringChar(String str) {

		// count array to hold the character count
		int count[] = new int[26];

		// count the character without checking case
		str = str.toLowerCase();

		// to store maximum occurring char ASCII no
		char maxOccuringChar = 0;

		// to store max count
		int maxCount = 0;

		// iterate the string
		for (int i = 0; i < str.length(); i++) {

			// pick a character and convert in ASCII no
			int ch = (int) str.charAt(i);

			// 97 is the ascii value for 'a'
			count[ch - 97] = count[ch - 97] + 1;

			// update the max count
			if (maxCount < count[ch - 97]) {
				maxOccuringChar = (char) ch;
				maxCount = count[ch - 97];
			}
		}

		return maxOccuringChar;
	}

	// main method to test
	public static void main(String[] args) {
		System.out.println("Find Maximum Occurring Character Example");
		System.out.println("Maximum Occurring Character in \"Java\" => " + findMaxOccurringChar("Java"));
		System.out.println("Maximum Occurring Character in \"Programming\" => " + findMaxOccurringChar("Programming"));
		System.out.println("Maximum Occurring Character in \"Example\" => " + findMaxOccurringChar("Example"));
	}

}
