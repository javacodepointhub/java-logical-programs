package com.javacodepoint.array.multidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput2DArray2 {

	public static void main(String[] args) {
		// Creating scanner object for reading user input
		Scanner sc = new Scanner(System.in);

		// Declaring a 3x3 matrix
		int matrix[][] = new int[3][3];

		// Read matrix value from user
		System.out.println("Enter the elements for 3x3 Matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter value for [" + i + "][" + j + "]= ");
				matrix[i][j] = sc.nextInt();
			}
		}

		// Print the Matrix
		System.out.println("The given matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			// Move cursor to next line
			System.out.println();
		}
	}

}
