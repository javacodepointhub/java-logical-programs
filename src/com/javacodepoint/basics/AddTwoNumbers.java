package com.javacodepoint.basics;

public class AddTwoNumbers {

	public static void main(String[] args) {

		// declare required variables
		int x, y, sum;

		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		// calculate the sum
		sum = x + y;

		// print the calculated sum
		System.out.println("The Sum of given two Numbers: " + sum);

	}

}
