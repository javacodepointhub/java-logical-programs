package com.javacodepoint.array;

public class InsertElement {
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int position = 2; // Position where element should be inserted (0-based index)
		int element = 25; // Element to be inserted

		// Create a new array of size n+1
		int[] newArr = new int[arr.length + 1];

		// Copy elements to the new array
		for (int i = 0; i < newArr.length; i++) {
			if (i < position) {
				newArr[i] = arr[i]; // Copy elements before the position
			} else if (i == position) {
				newArr[i] = element; // Insert new element
			} else {
				newArr[i] = arr[i - 1]; // Copy remaining elements
			}
		}

		// Print the new array
		System.out.println("Array after insertion:");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
