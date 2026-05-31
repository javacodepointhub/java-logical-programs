package com.javacodepoint.array.multidimensional;

public class Print2DArray {

	public static void main(String[] args) {

		// Declare and Initialize a 2D array or a Matrix
		int arr[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// Print 2D Array using for loops
		// Outer for loop for row iteration
		for (int i = 0; i < arr.length; i++) {

			// Inner for loop for column iteration
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			// To move cursor to new line
			System.out.println();
		}
	}

}
