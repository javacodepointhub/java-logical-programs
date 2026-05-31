package com.javacodepoint.array;

public class RemoveElement {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int removeIndex = 2; // Index of the element to be removed

		// Create a new array of size n-1
		int[] newArr = new int[arr.length - 1];

		// Copy elements to the new array, skipping the element to be removed
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i != removeIndex) {
				newArr[j++] = arr[i];
			}
		}

		// Print the new array
		System.out.println("Array after removing the element:");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
