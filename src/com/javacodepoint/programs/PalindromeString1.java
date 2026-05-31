package com.javacodepoint.programs;

public class PalindromeString1 {

	// Main method
	public static void main(String[] args) {

		//initializing a string to check string palindrome 
		String str = "madam";
		
		//check palindrome
		if(isPalindromeString(str)) {
			System.out.println(str+" is a palindrome string.");
		}else {
			System.out.println(str+" is not a palindrome string.");
		}
	}
	
	// Palindrome checking method
	public static boolean isPalindromeString(String str) {
		String reverse="";
		
		for(int i=0;i<str.length();i++) {
			reverse = str.charAt(i) + reverse;
		}
		
		// checking whether both are equals
		if(reverse.equals(str)) {			
			//String is Palindrome
			return true;			
		}else {			
			//String is not Palindrome
			return false;
		}
	}

}
