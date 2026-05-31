package com.javacodepoint.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmallestNumberInArray4 {

	public static void main(String[] args) {

		// Creating scanner object for reading user inputs
		Scanner sc = new Scanner(System.in);

		// Read the size of the Array
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();

		// Declare the integer Array of given size
		Integer arr[] = new Integer[n];

		// Reading the Array values
		System.out.println("Enter " + n + " element(s) of the Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Convert int array into list collection
		List<Integer> list = Arrays.asList(arr);

		// Sort the list in ascending order
		Collections.sort(list);

		int smallNumber = list.get(0);

		// Printing the smallest number
		System.out.println("The Smallest Number in Given Array: " + smallNumber);

	}

}
