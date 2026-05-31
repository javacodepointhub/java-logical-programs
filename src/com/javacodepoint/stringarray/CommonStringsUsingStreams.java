package com.javacodepoint.stringarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonStringsUsingStreams {
	public static void main(String[] args) {
		String[] array1 = { "apple", "banana", "grape", "orange" };
		String[] array2 = { "mango", "banana", "apple", "peach" };

		Set<String> set1 = new HashSet<>(Arrays.asList(array1));

		// Find common elements using Streams
		Set<String> commonWords = Arrays.stream(array2).filter(set1::contains).collect(Collectors.toSet());

		System.out.println("Common Strings: " + commonWords);
	}
}
