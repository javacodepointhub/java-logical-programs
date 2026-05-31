package com.javacodepoint.string;

public class RemoveCharacterFromString2 {

	public static String removeCharacter(String input, char charToRemove) {
		if (input == null || input.isEmpty()) {
			return input; // If the input is null or empty, return as it is.
		}

		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (c != charToRemove) {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String str = "javacodepoint.com";
		char charToRemove = 'a';

		String withoutCharacter = removeCharacter(str, charToRemove);

		System.out.println("Original String: " + str);
		System.out.println("String without '" + charToRemove + "': " + withoutCharacter);
	}
}
