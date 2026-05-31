package com.javacodepoint.string;

public class StringPermutations {

	public static void generatePermutations(String str, int left, int right) {
		if (left == right) {
			System.out.println(str);
			return;
		}

		for (int i = left; i <= right; i++) {
			str = swap(str, left, i); // Swap characters at positions 'left' and 'i'
			generatePermutations(str, left + 1, right); // Recur for remaining characters
			str = swap(str, left, i); // Backtrack by swapping back
		}
	}

	public static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String input = "ABC";
		System.out.println("Permutations of '" + input + "':");
		generatePermutations(input, 0, input.length() - 1);
	}
}
