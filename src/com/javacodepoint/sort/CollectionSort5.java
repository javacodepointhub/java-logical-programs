package com.javacodepoint.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort5 {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", 22), new Student("Bob", 20),
				new Student("Charlie", 23));

		System.out.println("Original List: " + students);

		// Sort the list by name
		Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

		System.out.println("Sorted List by Name: " + students);
	}
}
