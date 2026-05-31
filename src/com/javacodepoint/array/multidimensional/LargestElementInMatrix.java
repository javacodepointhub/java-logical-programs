package com.javacodepoint.array.multidimensional;

public class LargestElementInMatrix {
	
	public static int findLargestElement(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			throw new IllegalArgumentException("Input matrix is null or empty.");
		}

		int largest = matrix[0][0]; // Initialize with the first element of the matrix

		// Iterate through the matrix and update the largest value 
		// if a larger element is found
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > largest) {
					largest = matrix[i][j];
				}
			}
		}

		return largest;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 14, 12, 6 }, { 8, -3, 10 }, { 5, 19, 7 } };

		int largestElement = findLargestElement(matrix);

		System.out.println("Matrix:");
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

		System.out.println("The largest element in the matrix: " + largestElement);
	}
}
