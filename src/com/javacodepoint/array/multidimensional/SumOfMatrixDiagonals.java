package com.javacodepoint.array.multidimensional;

import java.util.Scanner;

public class SumOfMatrixDiagonals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the square matrix
		System.out.print("Enter the size of the square matrix: ");
		int size = scanner.nextInt();

		// Initialize the square matrix
		int[][] matrix = new int[size][size];

		// Input matrix elements
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		// Calculate the sum of the main diagonal
		int mainDiagonalSum = 0;
		for (int i = 0; i < size; i++) {
			mainDiagonalSum += matrix[i][i];
		}

		// Calculate the sum of the secondary diagonal
		int secondaryDiagonalSum = 0;
		for (int i = 0; i < size; i++) {
			secondaryDiagonalSum += matrix[i][size - 1 - i];
		}

		// Display the sums
		System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
		System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);

		scanner.close();
	}
}
