package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindCommonElementsInArrayListsDemo {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(40);
		list2.add(60);
		list2.add(80);

		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);

		// Finding common elements
		List<Integer> commonElements = findCommonElements(list1, list2);

		System.out.println("Common Elements: " + commonElements);
	}

	// Method to find common elements in two ArrayLists
	public static <T> List<T> findCommonElements(List<T> list1, List<T> list2) {
		HashSet<T> set1 = new HashSet<>(list1);
		HashSet<T> set2 = new HashSet<>(list2);

		set1.retainAll(set2);

		return new ArrayList<>(set1);
	}
}
