package com.javacodepoint.programs;

import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String[] args) {

		// take input from the user to calculate factorial for a given number

		System.out.println("Enter number to calculate factorial:");

		// reading user input using Scanner object
		int number = new Scanner(System.in).nextInt();
		
		if(number < 0) {
			System.out.println("Please enter only positive interger number");
			return;
		}
		
		System.out.println("Factorial of "+number+" is : "+clculateFactorial1(number));

	}
	
	/* 
	 * function to calculate factorial without recursion
	 */
	
	public static int clculateFactorial(int number) {
		
		int factorial = 1;
		
		while(number != 0){
			
			factorial = factorial * number ;
			number--;
		}
		
		return factorial;
	}
	
	/* 
	 * function to calculate factorial with recursion
	 */
	
	public static int clculateFactorial1(int number) {
		
		if(number == 0) {
			return 1;
		}
		
		return number * clculateFactorial1(number-1);
	}
}
