package com.javacodepoint.basics;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	// main method
	public static void main(String[] args) {

		// declaring num1 & num2 & num3 variables to take three numbers, sum variable to
		// calculate sum, and average to calculate average
		float num1, num2, num3, sum, average;

		// Scanner object for reading numbers from user input
		Scanner sc = new Scanner(System.in);

		// reading first number
		System.out.println("Enter the first number: ");
		num1 = sc.nextFloat();

		// reading second number
		System.out.println("Enter the second number: ");
		num2 = sc.nextFloat();

		// reading third number
		System.out.println("Enter the third number: ");
		num3 = sc.nextFloat();

		// calculating the sum of given all three numbers
		sum = num1 + num2+ num3;

		// calculating the average of the given three numbers
		average = sum / 3;

		// Printing the calculated average
		System.out.println("The Average of the given three Numbers= " + average);

	}

}
