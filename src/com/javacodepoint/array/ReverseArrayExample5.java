package com.javacodepoint.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//reverse an array using inbuilt methods (Collections.reverse)
public class ReverseArrayExample5 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5 };

		// Convert the array to a list and reverse it
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);

		System.out.println("Reversed array:");
		for (int num : list) {
			System.out.print(num + " ");
		}
	}
}
