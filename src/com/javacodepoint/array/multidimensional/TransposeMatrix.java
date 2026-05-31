package com.javacodepoint.array.multidimensional;

public class TransposeMatrix {
	
	public static int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] transposeMatrix = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}
		return transposeMatrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] transposeMatrix = transpose(matrix);

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		System.out.println("\nTranspose Matrix:");
		printMatrix(transposeMatrix);
	}

}
