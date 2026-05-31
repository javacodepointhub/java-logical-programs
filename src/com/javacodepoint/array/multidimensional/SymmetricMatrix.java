package com.javacodepoint.array.multidimensional;

public class SymmetricMatrix {
	
	public static boolean isSymmetric(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Check if the matrix is square
		if (rows != cols) {
			return false;
		}

		// Compare each element with its transposed element
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < cols; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Matrix:");
		for (int[] row : matrix1) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println("Is Symmetric Matrix: "+isSymmetric(matrix1));

		System.out.println("Matrix:");
		for (int[] row : matrix2) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println("Is Symmetric Matrix: "+isSymmetric(matrix2));
	}
}
