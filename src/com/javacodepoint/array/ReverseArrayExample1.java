package com.javacodepoint.array;

//reverse an array using temporary array
public class ReverseArrayExample1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[arr.length - 1 - i];
		}

		System.out.println("Reversed array:");
		for (int num : temp) {
			System.out.print(num + " ");
		}
	}
}
