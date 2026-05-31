package com.javacodepoint.array;

import java.util.ArrayList;

public class SeparateEvenOddExample1 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30, 35, 40 };
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		// Separate even and odd numbers
		for (int num : arr) {
			if (num % 2 == 0) {
				evenList.add(num);
			} else {
				oddList.add(num);
			}
		}

		// Convert lists to arrays
		int[] evenArray = evenList.stream().mapToInt(i -> i).toArray();
		int[] oddArray = oddList.stream().mapToInt(i -> i).toArray();

		// Print results
		System.out.println("Even elements: ");
		for (int num : evenArray) {
			System.out.print(num + " ");
		}
		System.out.println("\nOdd elements: ");
		for (int num : oddArray) {
			System.out.print(num + " ");
		}
	}
}
