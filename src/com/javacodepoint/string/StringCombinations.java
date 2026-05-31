package com.javacodepoint.string;

import java.util.ArrayList;
import java.util.List;
/*
 * Find the String Combinations Example
 */
public class StringCombinations {

	public static List<String> generateCombinations(String input) {
		List<String> combinations = new ArrayList<>();
		backtrack("", input, combinations);
		return combinations;
	}

	private static void backtrack(String current, String remaining, List<String> combinations) {
		// Base case: When there are no more characters remaining,
		// add the current combination to the list
		if (remaining.length() == 0) {
			combinations.add(current);
			return;
		}

		// include the first character of remaining in the current combination
		backtrack(current + remaining.charAt(0), remaining.substring(1), combinations);

		// exclude the first character of remaining from the current combination
		backtrack(current, remaining.substring(1), combinations);
	}

	public static void main(String[] args) {
		String input = "ABC";
		List<String> combinations = generateCombinations(input);

		System.out.println("Combinations of '" + input + "':");
		for (String combination : combinations) {
			System.out.println(combination);
		}
	}
}
