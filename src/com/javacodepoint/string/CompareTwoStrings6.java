package com.javacodepoint.string;

public class CompareTwoStrings6 {

	// Custom method to compare two Strings
	public static int compareTwoStrings(String s1, String s2) {

		// Get length of both string
		int s1Length = s1.length();
		int s2Length = s2.length();

		// Find minimum length
		int minLength = Math.min(s1Length, s2Length);

		for (int i = 0; i < minLength; i++) {
			int s1_ch = (int) s1.charAt(i);
			int s2_ch = (int) s2.charAt(i);

			if (s1_ch != s2_ch) {
				return s1_ch - s2_ch;
			}
		}

		if (s1Length != s2Length) {
			return s1Length - s2Length;
		} else {
			// both the strings are equal
			return 0;
		}
	}

	// Main method
	public static void main(String[] args) {

		// Declaring & Initializing multiple Strings
		String s1 = new String("Javacodepoint");
		String s2 = new String("JavaCodePoint");
		String s3 = new String("Java");
		String s4 = new String("Java");
		String s5 = new String("JAVA");
		String s6 = new String("Hello World");

		// Comparing two Strings
		System.out.println("Comparing " + s1 + " and " + s2 + " => " + compareTwoStrings(s1, s2));

		System.out.println("Comparing " + s3 + " and " + s4 + " => " + compareTwoStrings(s3, s4));

		System.out.println("Comparing " + s4 + " and " + s5 + " => " + compareTwoStrings(s4, s5));

		System.out.println("Comparing " + s5 + " and " + s6 + " => " + compareTwoStrings(s5, s6));

		System.out.println("Comparing " + s1 + " and " + s6 + " => " + compareTwoStrings(s1, s6));

	}

}
