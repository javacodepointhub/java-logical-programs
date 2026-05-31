package com.javacodepoint.basics;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {

		// Create scanner object to read user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number: ");
		int number = sc.nextInt();

		// Check whether Odd or Even
		// if number is divisible by 2 completely, then it is Even otherwise Odd
		if (number % 2 == 0) {
			System.out.println("Given number " + number + " is an Even number.");
		} else {
			System.out.println("Given number " + number + " is an Odd number.");
		}

	}

}
