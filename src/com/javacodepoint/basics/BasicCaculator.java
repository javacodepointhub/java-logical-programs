package com.javacodepoint.basics;

import java.util.Scanner;

public class BasicCaculator {

	public static void main(String[] args) {

		// declaring num1 and num2 to take two numbers from user and result to store
		// calculated value
		double num1, num2, result = 0;

		// scanner object to read inputs from user
		Scanner sc = new Scanner(System.in);

		// reading first number
		System.out.println("Enter first number:");
		num1 = sc.nextDouble();

		// reading second number
		System.out.println("Enter second number:");
		num2 = sc.nextDouble();

		// printing the calculator options
		System.out.println("Please choose your operation");
		System.out.println("_____________________________");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("_____________________________");

		// reading the choosen operation
		int operation = sc.nextInt();

		// based on selected operation calculating the result
		if (operation == 1) {
			result = num1 + num2;
		} else if (operation == 2) {
			result = num1 - num2;
		} else if (operation == 3) {
			result = num1 * num2;
		} else if (operation == 4) {
			result = num1 / num2;
		} else {
			System.out.println("Sorry! invalid option selected.");
			return;
		}

		// Finally printing the result
		System.out.println("The result: " + result);
	}

}
