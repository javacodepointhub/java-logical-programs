package com.javacodepoint.sort;

import java.util.Arrays;

public class ArraySort2 {
	public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Diana"};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(names));

        // Sort the array
        Arrays.sort(names);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(names));
    }
}
