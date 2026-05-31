package com.javacodepoint.programs;

import java.util.Scanner;

public class WordsCountInSentence {

	// Main method
	public static void main(String[] args) {

		// String variable to take a sentence from the user
		String sentence = null;
		
		//initialize the count variable to hold the words count
		int count=0;

		// Creating scanner class object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a sentence: ");

		// reading the sentence
		sentence = sc.nextLine();
		
		//extracting all words from the sentence
		String words[]=sentence.split(" ");
		
		//total words count
		count = words.length;
		
		System.out.println("The total number of words in given sentence are :"+count);

	}

}
