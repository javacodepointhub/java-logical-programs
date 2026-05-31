package com.javacodepoint.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountUsingMap {

	//Main method
	public static void main(String[] args) {
		
		// String variable to take a string input from the user
		String str = null;
		
		// Map variable to store the count
		Map<Character,Integer> map = new HashMap<>();

		// Creating scanner class object for reading user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string to count the characters: ");

		// reading the string input
		str = sc.next();
		
		// making string in lowercase
		str = str.toLowerCase();
		
		//iterate the string from beginning to end
		for(int i=0; i<str.length(); i++) {
			
			// pick the character
			char ch=str.charAt(i);
			
			if(map.containsKey(ch)) {
				//if character exist, increase count by 1
				int count=map.get(ch);				
				map.put(ch, count + 1);
			}else {
				//if character doesn't exist, initialize with 1
				map.put(ch, 1);
			}
		}
		
		//Printing the final result by iterating the map
		Iterator<Character> it= map.keySet().iterator();
		while(it.hasNext()) {
			char ch = it.next();
			int count = map.get(ch);
			System.out.println(ch+" => "+count);
		}

	}

}
