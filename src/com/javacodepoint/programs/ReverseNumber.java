package com.javacodepoint.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		// Taking input from the user to reverse
		
		System.out.print("Enter an integer number:");

		// Reading user input using Scanner object
		int number = new Scanner(System.in).nextInt();
		
		//Initiating reverse variable with 0 
		int reverse = 0;
		int tempNumber = number;
		
		// while loop will continue until the number become 0
		while(number > 0) {
			
			//Finding the last digit of the number
			int remainder = number % 10;
			
			//Calculating the reverse by multiplying it with 10 and adding remainder (last digit) 
			reverse = reverse * 10 + remainder;
			
			//Removing the last digit from the number
			number = number / 10;
		}
		
		System.out.print("The reverse of the given number is = "+reverse);

	}

}
