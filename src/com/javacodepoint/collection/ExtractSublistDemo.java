package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.List;

public class ExtractSublistDemo {

	public static void main(String[] args) {
		ArrayList<String> originalList = new ArrayList<>();
		originalList.add("Apple");
		originalList.add("Banana");
		originalList.add("Cherry");
		originalList.add("Date");
		originalList.add("Fig");

		System.out.println("Original List: " + originalList);

		int startIndex = 1; // Inclusive
		int endIndex = 3; // Exclusive

		// Extracting a sublist
		List<String> sublist = extractSublist(originalList, startIndex, endIndex);

		System.out.println("Sublist from index " + startIndex + " to " + endIndex + ": " + sublist);
	}

	// Method to extract a sublist from an ArrayList
	public static <T> List<T> extractSublist(List<T> list, int startIndex, int endIndex) {
		if (startIndex < 0 || endIndex > list.size() || startIndex > endIndex) {
			throw new IllegalArgumentException("Invalid start or end index");
		}

		return list.subList(startIndex, endIndex);
	}
}
