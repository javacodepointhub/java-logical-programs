package com.javacodepoint.array;

import java.util.ArrayList;

public class RemoveElement2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Remove element at index 2
		list.remove(2);

		// Print the updated list
		System.out.println("ArrayList after removing the element: " + list);
	}
}
