package com.javacodepoint.stringarray;

import java.util.Arrays;

public class MergeAndSortStrings {

	// Method to merge and sort two string arrays
	public static String[] mergeAndSortArrays(String[] array1, String[] array2) {
		int mergedLength = array1.length + array2.length;
		String[] mergedArray = new String[mergedLength];

		// Copy elements from both arrays
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		// Sort the merged array alphabetically
		Arrays.sort(mergedArray);

		return mergedArray;
	}

	public static void main(String[] args) {
		String[] array1 = { "banana", "apple", "grape" };
		String[] array2 = { "orange", "peach", "banana" };

		// Merge and sort arrays
		String[] sortedArray = mergeAndSortArrays(array1, array2);
		System.out.println("Merged and Sorted Array: " + Arrays.toString(sortedArray));
	}
}
