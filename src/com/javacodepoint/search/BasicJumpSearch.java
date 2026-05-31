package com.javacodepoint.search;

public class BasicJumpSearch {
	public static int jumpSearch(int[] array, int key) {
		int n = array.length;
		int step = (int) Math.sqrt(n);
		int prev = 0;

		// Jump through blocks
		while (array[Math.min(step, n) - 1] < key) {
			prev = step;
			step += (int) Math.sqrt(n);
			if (prev >= n) {
				return -1;
			}
		}

		// Linear search within the block
		while (array[prev] < key) {
			prev++;
			if (prev == Math.min(step, n)) {
				return -1;
			}
		}

		// Check if the key is found
		if (array[prev] == key) {
			return prev;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int key = 50;

		int result = jumpSearch(numbers, key);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}
	}
}
