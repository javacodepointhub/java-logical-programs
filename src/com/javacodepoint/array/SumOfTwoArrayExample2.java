package com.javacodepoint.array;

import java.util.Scanner;

public class SumOfTwoArrayExample2 {

	public static void main(String[] args) {

		// Creating scanner object for reading user inputs
		Scanner sc = new Scanner(System.in);

		// Read the size of the Array
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();

		// Declare the arr1 & arr2 of given size
		int arr1[] = new int[n];
		int arr2[] = new int[n];

		// Reading the arr1 values
		System.out.println("Enter " + n + " element(s) of the Array1: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		// Reading the arr2 values
		System.out.println("Enter " + n + " element(s) of the Array2: ");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		// 3rd Array to store the Sum
		int arr3[] = new int[arr1.length];

		// Adding arr1 and arr2 and storing into arr3
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}

		// Print the arr3 elements
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
