package com.javacodepoint.array;

public class CompareArrays {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 10, 20, 30, 40 };

		boolean areEqual = true;

		if (arr1.length != arr2.length) {
			areEqual = false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					areEqual = false;
					break;
				}
			}
		}

		if (areEqual) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}
	}
}
