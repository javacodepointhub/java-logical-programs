package com.javacodepoint.array;

public class PrintNegativeElements {
	public static void main(String[] args) {
		int[] arr = { 10, -5, 20, -15, 30, -25, 40 };

		System.out.println("Negative elements in the array:");
		for (int num : arr) {
			if (num < 0) {
				System.out.print(num + " ");
			}
		}
	}
}
