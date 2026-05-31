package com.javacodepoint.string;

import java.util.HashMap;
import java.util.Map;

/*
 * Find maximum occurring character using Map
 */
public class FindMaximumOccurringChar {

	// method to find maximum occurring character
	static char findMaxOccurringChar(String str) {

		// create HashMap to store count of every character
		Map<Character, Integer> map = new HashMap<>();

		// to store maximum occurring char
		char maxOccuringChar = 0;

		// to store max count
		int maxCount = 0;

		// iterate the string
		for (int i = 0; i < str.length(); i++) {

			// put element into map and increase its count
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

			// update the max count
			if (maxCount < map.get(ch)) {
				maxOccuringChar = ch;
				maxCount = map.get(ch);
			}
		}

		return maxOccuringChar;
	}

	// main method to test
	public static void main(String[] args) {
		System.out.println("Find Maximum Occurring Character Example");
		System.out.println("Maximum Occurring Character in \"hello\" => " + findMaxOccurringChar("hello"));
		System.out.println("Maximum Occurring Character in \"example\" => " + findMaxOccurringChar("example"));
		System.out.println("Maximum Occurring Character in \"apple\" => " + findMaxOccurringChar("apple"));
	}

}
