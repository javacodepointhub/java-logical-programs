package com.javacodepoint.basics;

import java.util.Scanner;

public class SimpleInterest {

	// main method
	public static void main(String[] args) {

		// Declare the required variables
		float principal, rate, time, si;

		// Scanner object to read inputs from user
		Scanner sc = new Scanner(System.in);

		// Reading inputs from user
		System.out.print("Enter the principal amount:: ");
		principal = sc.nextFloat();

		System.out.print("Enter the rate of interest:: ");
		rate = sc.nextFloat();

		System.out.print("Enter the time (in years):: ");
		time = sc.nextFloat();

		// Calculate the simple interest
		si = (principal * rate * time) / 100;

		// Print the result
		System.out.println("The simple interest:: " + si);
		System.out.println("Total amount to Pay (with interest):: " + (principal + si));

	}

}
