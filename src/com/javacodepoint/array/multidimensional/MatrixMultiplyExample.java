package com.javacodepoint.array.multidimensional;

public class MatrixMultiplyExample {

	public static void main(String[] args) {
		// Declare and Initialize two Matrices of 3x2 and 2x3
		int matrix1[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int matrix2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Declare a third Matrix of 3x3 to store the multiplication
		int matrix3[][] = new int[3][3];

		// row iteration
		for (int i = 0; i < 3; i++) {

			// column iteration
			for (int j = 0; j < 2; j++) {
				// multiplication initialize with 0
				matrix3[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		System.out.println("The given matrix:");
		printMatrix(matrix3, 3, 3);

	}

	// method to print any matrix
	public static void printMatrix(int m[][], int row, int col) {
		// row iteration
		for (int i = 0; i < row; i++) {
			// column iteration
			for (int j = 0; j < col; j++) {
				System.out.print(m[i][j] + " ");
			}
			// Move cursor to next line
			System.out.println();
		}
	}

}
