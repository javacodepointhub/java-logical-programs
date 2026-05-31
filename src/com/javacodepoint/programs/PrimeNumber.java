package com.javacodepoint.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.print("Enter an integer number:");

		// Reading user input using Scanner object
		int number = new Scanner(System.in).nextInt();
		
		if(number > 1 && checkPrime(number)) {
			System.out.println("Given number is a prime number.");
		}else {
			System.out.println("Given number is not a prime number.");
		}

	}
	
	/*
	 * function to check whether number is prime or not
	 */
	
	public static boolean checkPrime(int number) {
		
		boolean isPrime = true;
		
		for(int i=2; i <= (number/2); i++ ) {
			
			if(number % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		return isPrime;
		
	}

}
