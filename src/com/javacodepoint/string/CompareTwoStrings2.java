package com.javacodepoint.string;

public class CompareTwoStrings2 {

	public static void main(String[] args) {

		// Declaring & Initializing multiple Strings
		String s1 = new String("Javacodepoint");
		String s2 = new String("JavaCodePoint");
		String s3 = new String("Java");
		String s4 = new String("Java");
		String s5 = new String("JAVA");
		String s6 = new String("Example");

		// Comparing two Strings
		System.out.println("Comparing " + s1 + " and " + s2 + " => " + s1.equals(s2));// false

		System.out.println("Comparing " + s3 + " and " + s4 + " => " + s3.equals(s4));// true

		System.out.println("Comparing " + s4 + " and " + s5 + " => " + s4.equals(s5));// false

		System.out.println("Comparing " + s5 + " and " + s6 + " => " + s5.equals(s6));// false

		System.out.println("Comparing " + s1 + " and " + s6 + " => " + s1.equals(s6));// false

	}

}
