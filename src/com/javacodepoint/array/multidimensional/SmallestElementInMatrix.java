package com.javacodepoint.array.multidimensional;

public class SmallestElementInMatrix {

	public static int findSmallestElement(int[][] matrix) {

		if (matrix == null || matrix.length == 0) {
			throw new IllegalArgumentException("Input matrix is null or empty.");
		}

		// Initialize with the first element of the matrix
		int smallest = matrix[0][0];

		// Iterate through the matrix and update the smallest value
		// if a smaller element is found
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < smallest) {
					smallest = matrix[i][j];
				}
			}
		}

		return smallest;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 4, 12, 6 }, { 8, 3, 0 }, { -5, 9, 7 } };

		int smallestElement = findSmallestElement(matrix);

		System.out.println("Matrix:");
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

		System.out.println("Smallest element in the matrix: " + smallestElement);
	}
}
