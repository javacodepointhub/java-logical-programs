package com.javacodepoint.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateInArrayDemo4 {

	// Method to remove duplicate elements
	public static int removeDuplicate(int arr[]) {

		// array length
		int n = arr.length;

		// There is no duplicate element in array if length is 0 or 1
		if (n == 0 || n == 1) {
			return n;
		}

		// To hold only unique elements
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}

		// Update the original array
		Iterator<Integer> it = set.iterator();
		int index = 0;
		while (it.hasNext()) {
			arr[index++] = it.next();
		}
		return index;
	}

	// Main method
	public static void main(String[] args) {

		// Declare and Initialize an integer array
		int arr[] = { 5, 5, 10, 15, 16, 16, 20, 20, 25 };

		int length = removeDuplicate(arr);

		// After removing the duplicate elements, printing unique elements
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
