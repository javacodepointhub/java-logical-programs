package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.List;

/**
 * This program identifies and lists all palindrome words from a given array of
 * strings. A palindrome is a word that reads the same backward as forward.
 * Example: "madam" and "racecar" are palindromes, while "hello" is not.
 */
public class PalindromeWords {

	// Method to check if a string is a palindrome
	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;

		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false; // Not a palindrome
			}
			left++;
			right--;
		}
		return true; // Is a palindrome
	}

	// Method to identify all palindrome words in an array of strings
	public static List<String> findPalindromeWords(String[] words) {
		List<String> palindromeWords = new ArrayList<>();

		for (String word : words) {
			if (isPalindrome(word)) {
				palindromeWords.add(word);
			}
		}

		return palindromeWords;
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] words = { "madam", "racecar", "hello", "level", "world", "radar" };

		// Find and print all palindrome words
		List<String> palindromeWords = findPalindromeWords(words);
		System.out.println("Palindrome words: " + palindromeWords);
	}
}
