package com.javacodepoint.basics;

import java.util.Scanner;

public class AverageOfTwoNumbers {

	// main method
	public static void main(String[] args) {

		// declaring num1 & num2 variables to take two numbers, sum variable to
		// calculate sum, and average to calculate average
		float num1, num2, sum, average;

		// Scanner object for reading two numbers from user input
		Scanner sc = new Scanner(System.in);

		// reading first number
		System.out.println("Enter the first number: ");
		num1 = sc.nextFloat();

		// reading second number
		System.out.println("Enter the second number: ");
		num2 = sc.nextFloat();

		// calculating sum of given two numbers
		sum = num1 + num2;

		// calculating the average of given two numbers
		average = sum / 2;

		// Printing the calculated average
		System.out.println("The average of the given two Numbers= " + average);

	}

}
