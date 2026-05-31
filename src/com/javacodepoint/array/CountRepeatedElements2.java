package com.javacodepoint.array;

import java.util.HashMap;

public class CountRepeatedElements2 {
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 30, 40, 10, 30 };

		HashMap<Integer, Integer> elementCount = new HashMap<>();

		// Count occurrences
		for (int num : arr) {
			elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
		}

		System.out.println("Repeated elements and their counts:");
		for (int key : elementCount.keySet()) {
			if (elementCount.get(key) > 1) {
				System.out.println(key + ": " + elementCount.get(key));
			}
		}
	}
}
