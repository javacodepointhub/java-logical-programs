package com.javacodepoint.programs;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		
		// Taking input from the user to check Palindrome number

		System.out.print("Enter an integer number:");

		// Reading user input using Scanner object
		int number = new Scanner(System.in).nextInt();
		
		// Calling method to check Palindrome
		if(isPalindromeNumber(number)) {
			System.out.print("The given number is a Palindrome number.");
		}else {
			System.out.print("The given number is not a Palindrome number.");
		}

	}
	
	/*
	 * Method to check number is Palindrome number or not
	 */
	public static boolean isPalindromeNumber(int number) {
		int remainder, reverse=0;      
        
		//Storing number into a temporary variable  
        int temp = number;      
          
        //Reversing the number  
        while(number > 0){
        	//calculating remainder
        	remainder = number % 10;  
        	
        	//calculate reverse of the number when loop ends.
        	reverse = (reverse*10) + remainder;
        	
        	//removing last digit from the number
            number = number/10;      
        }   
  
        //Checking whether the reversing number is equal to the number or not  
        if(temp == reverse) {
        	return true;
        }
        return false;
	}

}
