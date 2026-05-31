package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseListExample {
	
	public static void main(String[] args) {
		List<Integer> originalList = new ArrayList<>();
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(4);
		originalList.add(5);

		System.out.println("Original List: " + originalList);

		List<Integer> reversedList = reverseList(originalList);

		System.out.println("Reversed List: " + reversedList);
	}

	// Method to reverse a list
	public static <T> List<T> reverseList(List<T> inputList) {
		List<T> reversed = new ArrayList<>();

		for (int i = inputList.size() - 1; i >= 0; i--) {
			reversed.add(inputList.get(i));
		}

		return reversed;
	}
}
