package com.javacodepoint.array;

import java.util.Scanner;

public class MergeArrayExample2 {

	public static void main(String[] args) {

		// Creating scanner object for reading user inputs
		Scanner sc = new Scanner(System.in);

		// Read the first array size
		System.out.println("Enter the size of the first Array: ");
		int n = sc.nextInt();

		// Declare the first Array with given size
		int arr1[] = new int[n];

		// Reading the values for first Array
		System.out.println("Enter " + n + " element(s) for the first Array: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		// Read the second array size
		System.out.println("Enter the size of the second Array: ");
		n = sc.nextInt();

		// Declare the second Array with given size
		int arr2[] = new int[n];

		// Reading the values for second Array
		System.out.println("Enter " + n + " element(s) for the second Array: ");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		// Declare another array to merge both array
		// The size of arr3 will be total sum of arr1 and arr2 size
		int arr3[] = new int[arr1.length + arr2.length];

		int count = 0;

		// Copy arr1 elements to arr3
		for (int i = 0; i < arr1.length; i++) {
			arr3[count++] = arr1[i];
		}

		// Copy arr2 elements to arr3
		for (int i = 0; i < arr2.length; i++) {
			arr3[count++] = arr2[i];
		}

		// Print the merged array elements
		System.out.println("Merged array elements: ");
		for (int i = 0; i < count; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
