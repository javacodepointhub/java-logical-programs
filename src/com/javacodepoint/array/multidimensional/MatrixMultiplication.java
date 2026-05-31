package com.javacodepoint.array.multidimensional;

public class MatrixMultiplication {
	
	// method to multiply two matrices
	public static int[][] multiplyMatrices(int[][] A, int[][] B) {
		int m = A.length; // Number of rows in matrix A
		int n = A[0].length; // Number of columns in matrix A
		int p = B[0].length; // Number of columns in matrix B

		int[][] result = new int[m][p];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				for (int k = 0; k < n; k++) {
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		return result;
	}
	
	// method to print given matrix
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	// main method
	public static void main(String[] args) {
		int[][] A = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] B = { { 7, 8, 9 }, { 10, 11, 12 } };

		int[][] result = multiplyMatrices(A, B);

		System.out.println("Matrix A:");
		printMatrix(A);

		System.out.println("\nMatrix B:");
		printMatrix(B);

		System.out.println("\nResulting Matrix (A * B):");
		printMatrix(result);
	}
}
