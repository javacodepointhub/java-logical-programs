package com.javacodepoint.array.basic;
//Get Array Input Using a Static Array (Hardcoded Values)
public class StaticArrayInput {
	public static void main(String[] args) {
		// Initialize an array with fixed values
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Print the array elements
		System.out.println("Array elements:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
