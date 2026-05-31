package com.javacodepoint.array.multidimensional;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {

	public static void main(String[] args) {

		// Declare and Initialize a 2D array or a Matrix
		int arr[][] = { { 10, 21 }, { 31, 14 }, { 50, 6 } };

		// Sort 2D Array
		Arrays.sort(arr, (a, b) -> Double.compare(a[0], b[0]));
		
		System.out.println(Arrays.deepToString(arr));
	}

}
