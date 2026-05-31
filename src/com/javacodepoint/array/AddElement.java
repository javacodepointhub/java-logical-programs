package com.javacodepoint.array;

public class AddElement {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int element = 60; // Element to be added

		// Create a new array of size n+1
		int[] newArr = new int[arr.length + 1];

		// Copy elements to the new array
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}

		// Add the new element at the end
		newArr[arr.length] = element;

		// Print the new array
		System.out.println("Array after adding an element:");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
