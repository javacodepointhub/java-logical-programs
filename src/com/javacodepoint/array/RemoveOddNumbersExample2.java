package com.javacodepoint.array;

import java.util.ArrayList;

public class RemoveOddNumbersExample2 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30, 35, 40 };

		ArrayList<Integer> evenList = new ArrayList<>();

		// Add only even numbers to the list
		for (int num : arr) {
			if (num % 2 == 0) {
				evenList.add(num);
			}
		}

		// Convert ArrayList to array
		int[] evenArray = new int[evenList.size()];
		for (int i = 0; i < evenList.size(); i++) {
			evenArray[i] = evenList.get(i);
		}

		// Print the new array
		System.out.println("Array after removing odd numbers:");
		for (int num : evenArray) {
			System.out.print(num + " ");
		}
	}
}
