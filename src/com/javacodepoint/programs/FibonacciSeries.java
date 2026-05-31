package com.javacodepoint.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// take input from the user to print Fibonacci series upto how many numbers

		System.out.println("Enter number upto which Fibonacci series to print:");

		// reading user input using Scanner object
		int upto = new Scanner(System.in).nextInt();

		// initiating first two numbers of the Fibonacci series
		int number1 = 0;
		int number2 = 1;

		// printing first two numbers
		System.out.print(number1 + " " + number2);

		// start the loop from 3 because first two already printed
		for (int i = 3; i <= upto; i++) {
			int nextNumber = number1 + number2;
			System.out.print(" " + nextNumber);
			number1 = number2;
			number2 = nextNumber;
		}
	}

}
