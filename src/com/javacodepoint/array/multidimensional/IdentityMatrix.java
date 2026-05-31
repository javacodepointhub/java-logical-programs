package com.javacodepoint.array.multidimensional;

public class IdentityMatrix {

	public static boolean isIdentityMatrix(int[][] matrix) {

		if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
			return false; // If the matrix is not square or it's null/empty, it can't be an identity
							// matrix.
		}

		int n = matrix.length;

		// Check diagonal elements are 1 and all other elements are 0
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					if (matrix[i][j] != 1) {
						return false;
					}
				} else {
					if (matrix[i][j] != 0) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		int[][] matrix2 = { { 1, 0, 1 }, { 0, 1, 0 }, { 0, 0, 1 } };

		System.out.println("Matrix:");
		for (int[] row : matrix1) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println("Is Identity Matrix: " + isIdentityMatrix(matrix1));

		System.out.println("\nMatrix:");
		for (int[] row : matrix2) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println("Is Identity Matrix: " + isIdentityMatrix(matrix2));
	}
}
