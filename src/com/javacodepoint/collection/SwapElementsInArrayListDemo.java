package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementsInArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> elements = new ArrayList<>();
		elements.add("Apple");
		elements.add("Banana");
		elements.add("Cherry");
		elements.add("Date");
		elements.add("Fig");

		System.out.println("Original List: " + elements);

		int index1 = 1;
		int index2 = 3;

		// Swapping elements at index1 and index2
		swapElements(elements, index1, index2);

		System.out
				.println("List after swapping elements at index " + index1 + " and index " + index2 + ": " + elements);
	}

	// Method to swap elements in an ArrayList given their indices
	public static <T> void swapElements(List<T> list, int index1, int index2) {
		if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
			throw new IndexOutOfBoundsException("Invalid index");
		}

		Collections.swap(list, index1, index2);
	}
}
