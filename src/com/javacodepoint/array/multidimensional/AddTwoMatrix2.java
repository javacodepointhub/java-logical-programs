package com.javacodepoint.array.multidimensional;

import java.util.Scanner;

/**
 * Matrix Addition Example using Scanner
 */
public class AddTwoMatrix2 {

	public static void main(String[] args) {

		// Declare variables for matrix dimension
		int row1, col1, row2, col2;

		// Creating scanner object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first matrix dimension,");
		System.out.print("Row= ");
		row1 = sc.nextInt();
		System.out.print("Column= ");
		col1 = sc.nextInt();

		System.out.println("Enter the second matrix dimension,");
		System.out.print("Row= ");
		row2 = sc.nextInt();
		System.out.print("Column= ");
		col2 = sc.nextInt();

		if (row1 != row2 || col1 != col2) {
			System.out.println("Addition of Matrices is not possible. Dimensions of both matrices should be same!");
			return;
		}

		// Declare three Matrices
		int matrix1[][] = new int[row1][col1];
		int matrix2[][] = new int[row2][col2];
		int matrix3[][] = new int[row1][col1]; // can be take row2/col2 as well

		// Read the user inputs for matrix1
		System.out.println("Enter Matrix1 (" + row1 + "x" + col1 + "),");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print("Enter value for [" + i + "][" + j + "]= ");
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Read the user inputs for matrix2
		System.out.println("Enter Matrix2 (" + row1 + "x" + col1 + "),");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.print("Enter value for [" + i + "][" + j + "]= ");
				matrix2[i][j] = sc.nextInt();
			}
		}

		// Add two matrices
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Print the result matrix
		System.out.println("The resultant Matrix3 (" + row1 + "x" + col1 + "),");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print(matrix3[i][j] + "  ");
			}
			// move cursor to new row/line
			System.out.println();
		}

	}

}
