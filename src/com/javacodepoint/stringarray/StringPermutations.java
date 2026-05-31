package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

	public static void main(String[] args) {
		// Input array of strings
		String[] words = { "apple", "banana", "cherry" };

		// Generate permutations
		List<String[]> permutations = generatePermutations(words);

		// Display the results
		System.out.println("Permutations:");
		for (String[] permutation : permutations) {
			System.out.println(String.join(", ", permutation));
		}
	}

	// Method to generate all permutations of an array
	public static List<String[]> generatePermutations(String[] array) {
		List<String[]> result = new ArrayList<>();
		permute(array, 0, result);
		return result;
	}

	// Helper method for recursion and backtracking
	private static void permute(String[] array, int index, List<String[]> result) {
		if (index == array.length - 1) {
			// Add a copy of the array to the result list
			result.add(array.clone());
			return;
		}

		for (int i = index; i < array.length; i++) {
			// Swap elements
			swap(array, index, i);

			// Recurse to generate permutations for the next index
			permute(array, index + 1, result);

			// Backtrack: restore the original state
			swap(array, index, i);
		}
	}

	// Method to swap two elements in an array
	private static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
