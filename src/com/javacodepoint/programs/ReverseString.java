package com.javacodepoint.programs;

import java.util.Scanner;

public class ReverseString {

	//Main method
	public static void main(String[] args) {
		
		//String variable to take a string input from the user
		String str=null;
		
		//Initializing string variable to hold the reverse of the string
		String reverse="";
		
		//Creating scanner class object for reading user input		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string to reverse: ");
		
		//reading the string input
		str=sc.next();
		
		//iterating the string from the last to beginning
		for(int i=str.length()-1; i>=0; i--) {
			
			//picking one by one character and concatenating it with reverse
			reverse =  reverse + str.charAt(i);
		}
		
		//Final output
		System.out.println("The reverse of "+str+" is "+reverse);

	}

}
