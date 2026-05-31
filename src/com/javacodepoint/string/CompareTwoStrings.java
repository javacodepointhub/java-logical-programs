package com.javacodepoint.string;

public class CompareTwoStrings {

	public static void main(String[] args) {

		// Declaring & Initializing multiple Strings
		String s1 = new String("Javacodepoint");
		String s2 = new String("Javacodepoint");
		String s3 = "Javacodepoint";
		String s4 = "Java";
		String s5 = "Java";

		// Comparing two Strings
		System.out.println("Comparing " + s1 + " and " + s2 + " => " + (s1 == s2));// false

		System.out.println("Comparing " + s2 + " and " + s3 + " => " + (s2 == s3));// false

		System.out.println("Comparing " + s3 + " and " + s4 + " => " + (s3 == s4));// false

		System.out.println("Comparing " + s4 + " and " + s5 + " => " + (s4 == s5));// true

		System.out.println("Comparing " + s1 + " and " + s5 + " => " + (s1 == s5));// false

	}

}
