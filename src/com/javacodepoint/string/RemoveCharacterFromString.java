package com.javacodepoint.string;

public class RemoveCharacterFromString {
	
	public static String removeCharacter(String input, char charToRemove) {
		if (input == null || input.isEmpty()) {
			return input; // If the input is null or empty, return as it is.
		}

		// Use the replace method to remove all occurrences of the given character
		String result = input.replace(String.valueOf(charToRemove), "");

		return result;
	}

	public static void main(String[] args) {
		String inputStr = "Hello, World!";
		char charToRemove = 'l';

		String withoutCharacter = removeCharacter(inputStr, charToRemove);

		System.out.println("Original String: " + inputStr);
		System.out.println("String without '" + charToRemove + "': " + withoutCharacter);
	}
}
