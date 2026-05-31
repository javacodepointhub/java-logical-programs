package com.javacodepoint.string;

public class ReplaceExample {
	public static void main(String[] args) {
        String inputString = "Hello, World!";
        String regex = "[H]"; // Regular expression that matches 'H', 'l', 'o', or 'W'
        String replacement = "X";

        String replacedWithReplace = inputString.replaceAll("l", replacement);
        String replacedWithReplaceAll = inputString.replaceAll(regex, replacement);

        System.out.println("Using replace: " + replacedWithReplace);
        System.out.println("Using replaceAll: " + replacedWithReplaceAll);
    }
}
