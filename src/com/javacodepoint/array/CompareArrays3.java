package com.javacodepoint.array;

import java.util.Arrays;

public class CompareArrays3 {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		if (Arrays.deepEquals(arr1, arr2)) {
			System.out.println("Multidimensional arrays are equal.");
		} else {
			System.out.println("Multidimensional arrays are not equal.");
		}
	}
}
