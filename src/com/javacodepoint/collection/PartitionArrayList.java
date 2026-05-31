package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.List;

public class PartitionArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(6);
		numbers.add(15);
		numbers.add(30);
		numbers.add(7);

		System.out.println("Original List: " + numbers);

		// Partition the list into even and odd lists
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		partitionArrayList(numbers, evenList, oddList);

		System.out.println("Even Numbers List: " + evenList);
		System.out.println("Odd Numbers List: " + oddList);
	}

	// Method to partition an ArrayList into even and odd lists
	public static void partitionArrayList(List<Integer> originalList, List<Integer> evenList, List<Integer> oddList) {
		for (Integer number : originalList) {
			if (number % 2 == 0) {
				evenList.add(number); // Even number, add to even list
			} else {
				oddList.add(number); // Odd number, add to odd list
			}
		}
	}
}
