package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckOddEven2 {

	public static void main(String[] args) {

		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number: ");
		int number = sc.nextInt();

		// Check Odd or Even using ternary operator
		String result = (number % 2 == 0) ? "Even number." : "Odd number.";

		// Print the result
		System.out.println("Given number " + number + " is an " + result);
	}

}
