package com.javacodepoint.array.multidimensional;

public class DiagonalSumOfMatrix {

	public static void main(String[] args) {
		// Initialize a square matrix (3x3 in this example)
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Calculate the sums of both diagonals
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;

		// The number of rows (assuming it's a square matrix)
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			// Sum of the primary diagonal (top-left to bottom-right)
			primaryDiagonalSum += matrix[i][i];

			// Sum of the secondary diagonal (top-right to bottom-left)
			secondaryDiagonalSum += matrix[i][n - 1 - i];
		}
		
		// Print the Matrix
		System.out.println("Matrix:");
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

		// Print the sums of both diagonals
		System.out.println("Sum of the Primary Diagonal: " + primaryDiagonalSum);
		System.out.println("Sum of the Secondary Diagonal: " + secondaryDiagonalSum);
	}
}
