package com.javacodepoint.string;

import java.util.Objects;

public class CompareTwoStrings4 {

	public static void main(String[] args) {

		// Declaring & Initializing multiple Strings
		String s1 = new String("Javacodepoint");
		String s2 = new String("Javacodepoint");
		String s3 = null;
		String s4 = new String("Java");
		String s5 = new String("Java");

		// Comparing two Strings
		System.out.println("Comparing " + s1 + " and " + s2 + " => " + Objects.equals(s1, s2));// true

		System.out.println("Comparing " + s1 + " and " + s3 + " => " + Objects.equals(s1, s3));// false

		System.out.println("Comparing " + s3 + " and " + s4 + " => " + Objects.equals(s3, s4));// false

		System.out.println("Comparing " + s4 + " and " + s5 + " => " + Objects.equals(s4, s5));// true

	}

}
