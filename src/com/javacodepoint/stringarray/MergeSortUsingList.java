package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortUsingList {
	public static void main(String[] args) {
		String[] array1 = { "banana", "apple", "grape" };
		String[] array2 = { "orange", "peach", "banana" };

		// Convert arrays to a List and merge
		List<String> mergedList = new ArrayList<>(Arrays.asList(array1));
		mergedList.addAll(Arrays.asList(array2));

		// Sort the list
		Collections.sort(mergedList);

		// Convert back to array and print
		String[] sortedArray = mergedList.toArray(new String[0]);
		System.out.println("Merged and Sorted Array: " + Arrays.toString(sortedArray));
	}
}
