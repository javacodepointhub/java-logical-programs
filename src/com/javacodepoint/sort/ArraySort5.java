package com.javacodepoint.sort;

import java.util.Arrays;

public class ArraySort5 {
	public static void main(String[] args) {
		Student[] students = { 
				new Student("Alice", 22), 
				new Student("Bob", 20), 
				new Student("Charlie", 23) 
			};

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(students));

		// Sort by age
		Arrays.sort(students, (s1, s2) -> Integer.compare(s1.age, s2.age));

		System.out.println("Sorted by Age:");
		System.out.println(Arrays.toString(students));
	}
}
