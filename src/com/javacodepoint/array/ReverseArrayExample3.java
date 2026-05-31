package com.javacodepoint.array;

//reverse an array by swapping elements
public class ReverseArrayExample3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println("Reversed array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
