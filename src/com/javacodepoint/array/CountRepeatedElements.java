package com.javacodepoint.array;

public class CountRepeatedElements {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 30, 40, 10, 30 };
		boolean[] visited = new boolean[arr.length]; // To track visited elements

		System.out.println("Repeated elements and their counts:");
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true;
						count++;
					}
				}
				if (count > 1) {
					System.out.println(arr[i] + ": " + count);
				}
			}
		}
	}
}
