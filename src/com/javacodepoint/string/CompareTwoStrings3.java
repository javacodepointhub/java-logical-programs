package com.javacodepoint.string;

public class CompareTwoStrings3 {

	public static void main(String[] args) {

		// Declaring & Initializing multiple Strings
		String s1 = new String("Javacodepoint");
		String s2 = new String("JavaCodePoint");
		String s3 = new String("JAVACODEPOINT");
		String s4 = new String("Java");
		String s5 = new String("JAVA");

		// Comparing two Strings
		System.out.println("Comparing " + s1 + " and " + s2 + " => " + s1.equalsIgnoreCase(s2));// true

		System.out.println("Comparing " + s1 + " and " + s3 + " => " + s1.equalsIgnoreCase(s3));// true

		System.out.println("Comparing " + s3 + " and " + s4 + " => " + s3.equalsIgnoreCase(s4));// false

		System.out.println("Comparing " + s4 + " and " + s5 + " => " + s4.equalsIgnoreCase(s5));// true

	}

}
