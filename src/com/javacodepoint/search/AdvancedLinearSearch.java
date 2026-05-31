package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}

public class AdvancedLinearSearch {
	public static Person linearSearch(List<Person> people, String key) {
		for (Person person : people) {
			if (person.getName().equalsIgnoreCase(key)) {
				return person; // Return the matching Person object
			}
		}
		return null; // Key not found
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 25));
		people.add(new Person("Bob", 30));
		people.add(new Person("Charlie", 35));

		String key = "Bob";

		Person result = linearSearch(people, key);

		if (result != null) {
			System.out.println("Person found: " + result);
		} else {
			System.out.println("Person not found.");
		}
	}
}