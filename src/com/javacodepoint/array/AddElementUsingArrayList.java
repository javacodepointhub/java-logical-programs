package com.javacodepoint.array;

import java.util.ArrayList;

public class AddElementUsingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Add the new element
		list.add(60);

		// Print the updated list
		System.out.println("ArrayList after adding an element: " + list);
	}
}
