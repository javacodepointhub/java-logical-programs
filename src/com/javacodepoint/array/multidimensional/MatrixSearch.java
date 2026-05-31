package com.javacodepoint.array.multidimensional;

public class MatrixSearch {

	// search element in matrix
	public static int[] searchElement(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == target) {
					return new int[] { i, j };
				}
			}
		}

		// If the element is not found, return {-1, -1}
		return new int[] { -1, -1 };
	}

	// main method to test
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int target = 5;

		int[] position = searchElement(matrix, target);

		if (position[0] != -1 && position[1] != -1) {
			System.out.printf("Element %d found at position [%d, %d]\n", target, position[0], position[1]);
		} else {
			System.out.println("Element not found in the matrix.");
		}
	}
}
