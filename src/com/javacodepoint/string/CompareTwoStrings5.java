package com.javacodepoint.string;

public class CompareTwoStrings5 {

	public static void main(String[] args) {

		// Declaring & Initializing multiple Strings
		String s1 = new String("Javacodepoint");
		String s2 = new String("Javacodepoint");
		String s3 = new String("JAVA");
		String s4 = new String("Java");
		String s5 = new String("HELLO");

		// Comparing two Strings
		System.out.println("Comparing " + s1 + " and " + s2 + " => " + s1.compareTo(s2));

		System.out.println("Comparing " + s1 + " and " + s3 + " => " + s1.compareTo(s3));

		System.out.println("Comparing " + s3 + " and " + s4 + " => " + s3.compareTo(s4));

		System.out.println("Comparing " + s4 + " and " + s5 + " => " + s4.compareTo(s5));

	}

}
