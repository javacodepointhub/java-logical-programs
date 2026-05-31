package com.javacodepoint.array.basic;

import java.util.Scanner;

// Get Array Input Using Scanner (User Input from Console)
public class ScannerArrayInput {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[size];

        // Input array elements from user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
