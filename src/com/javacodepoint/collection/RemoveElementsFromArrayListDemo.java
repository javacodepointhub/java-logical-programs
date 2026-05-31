package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementsFromArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(5);
		numbers.add(15);
		numbers.add(30);
		numbers.add(20);

		int maxValue = 20;

		System.out.println("Original List: " + numbers);

		// Removing elements greater than maxValue
		removeGreaterThan(numbers, maxValue);

		System.out.println("List after removing elements greater than " + maxValue + ": " + numbers);
	}

	// Method to remove elements greater than a given value
	public static void removeGreaterThan(ArrayList<Integer> list, int value) {
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			if (iterator.next() > value) {
				iterator.remove();
			}
		}
	}
}
