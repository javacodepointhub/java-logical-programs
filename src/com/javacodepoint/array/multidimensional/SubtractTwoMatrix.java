package com.javacodepoint.array.multidimensional;

/**
 * Matrix Subtraction Example
 */
public class SubtractTwoMatrix {

	public static void main(String[] args) {
		
		// Declare and Initialize 
		// two Matrices of dimension 3x2
		int matrix1[][] = { { 1, 2 }, 
							{ 3, 4 }, 
							{ 5, 6 } 
						  };
		int matrix2[][] = { { -1, 2 }, 
							{ 2, -4 }, 
							{ 1, 9 } 
						  };
		
		// Declare third matrix of same dimension 3x2
		// to store the subtraction of two matrices
		int matrix3[][] = new int[3][2];
		
		// Subtract two matrices
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}

		// Print the result matrix
		System.out.println("The resultant Matrix3 =>");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[0].length; j++) {
				System.out.print(matrix3[i][j] + "  ");
			}
			// move cursor to new row/line
			System.out.println();
		}

	}

}
