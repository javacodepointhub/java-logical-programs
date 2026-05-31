package com.javacodepoint.programs;

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {

	// initiating first two numbers of the Fibonacci series
	static int number1 = 0;
	static int number2 = 1;

	public static void main(String[] args) {

		// Taking input from the user to print Fibonacci series upto how many numbers

		System.out.println("Enter number upto which Fibonacci series to print:");

		// Reading user input using Scanner object
		int upto = new Scanner(System.in).nextInt();

		// Printing first two numbers
		System.out.print(number1 + " " + number2);

		// Calling recursive function by decreasing 2 because two numbers already printed
		printFibonacci(upto - 2);

	}

	/*
	 * Recursive function
	 */
	public static void printFibonacci(int count) {

		if (count > 0) {
			int nextNumber = number1 + number2;
			number1 = number2;
			number2 = nextNumber;

			System.out.print(" " + nextNumber);

			// call the recursive function again
			printFibonacci(count - 1);
		}
	}
}
