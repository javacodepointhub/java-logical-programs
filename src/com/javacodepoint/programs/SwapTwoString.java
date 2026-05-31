package com.javacodepoint.programs;

public class SwapTwoString {

	// Main method
	public static void main(String[] args) {

		// initializing two string variable
		String s1 = "abc";
		String s2 = "xyz123";

		System.out.println("Before swap :: s1=>" + s1 + ", s2=>" + s2);

		// step-1
		s1 = s1 + s2;

		// step-2
		s2 = s1.substring(0, s1.length() - s2.length());

		// step-3
		s1 = s1.substring(s2.length());

		System.out.println("After swap :: s1=>" + s1 + ", s2=>" + s2);

	}

}
