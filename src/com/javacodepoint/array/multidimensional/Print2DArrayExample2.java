package com.javacodepoint.array.multidimensional;

public class Print2DArrayExample2 {

	public static void main(String[] args) {

		// Declare and Initialize a 2D array or a Matrix
		int matrix[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// Print matrix using for-each loop
		// Outer for loop for row iteration
		for (int[] arr : matrix) {
			// Inner for loop for column iteration
			for (int i : arr) {
				System.out.print(i + " ");
			}
			// To move cursor to new line
			System.out.println();
		}
	}
}
