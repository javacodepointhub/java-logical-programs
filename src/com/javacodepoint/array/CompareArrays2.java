package com.javacodepoint.array;

import java.util.Arrays;

public class CompareArrays2 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 10, 20, 30, 40 };

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}
	}
}
