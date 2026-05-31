package com.javacodepoint.programs;

import java.util.Arrays;

public class CheckAnagramString {

	//Main method
	public static void main(String[] args) {
		
		//initializing two string to check anagram string
		String str1 = "Army";
		String str2 = "mary";

		System.out.println("Checking whether str1 and str2 are an anagram of each other or not: "
				+ checkAnagram(str1, str2));
	}

	//Method to check anagram string
	public static boolean checkAnagram(String s1, String s2) {
		
		//converting into char array from string
		char[] s1CharArray = s1.toLowerCase().toCharArray();
		char[] s2CharArray = s2.toLowerCase().toCharArray();
		
		//sorting the char array
		Arrays.sort(s1CharArray);
		Arrays.sort(s2CharArray);

		//checking whether both char array equals or not
		//if equals then both strings are anagram of each other
		return Arrays.equals(s1CharArray, s2CharArray);

	}

}
