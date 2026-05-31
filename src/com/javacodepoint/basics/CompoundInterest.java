package com.javacodepoint.basics;

import java.util.Scanner;

public class CompoundInterest {

	// main method
	public static void main(String[] args) {

		// Declare required variables
		double principal, rate, time, ci;

		// Create scanner object to read user inputs
		Scanner sc = new Scanner(System.in);

		// Read the principal amount
		System.out.print("Enter Principal amount: ");
		principal = sc.nextDouble();

		// Read the rate of interest
		System.out.print("Enter the rate of interest: ");
		rate = sc.nextDouble();

		// Read the number of years
		System.out.print("Enter time in years: ");
		time = sc.nextDouble();

		// Calculate compound interest
		ci = principal * Math.pow((1 + rate / 100), time) - principal;

		// Print the calculated value
		System.out.println("The Compound Interest is:: " + ci);
		System.out.println("The total amount paid (with interest) is:: " + (principal + ci));

	}

}
