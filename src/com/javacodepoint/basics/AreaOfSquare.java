package com.javacodepoint.basics;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {

		// declare required variables
		double side, area;

		// create scanner object to read user inputs
		Scanner sc = new Scanner(System.in);

		// read one side of square
		System.out.print("Enter one side of square: ");
		side = sc.nextDouble();

		area = side * side;

		System.out.println("Area of the square :: " + area);

	}

}
