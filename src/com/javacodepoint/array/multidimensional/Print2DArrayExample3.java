package com.javacodepoint.array.multidimensional;

import java.util.Arrays;

public class Print2DArrayExample3 {

	public static void main(String[] args) {

		// Declare and Initialize a 2D array (Matrix) of 3x3 size
		int matrix[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		// Print 2D Array or Matrix using deepToString() method of Arrays
		System.out.println(Arrays.deepToString(matrix));
	}
}
