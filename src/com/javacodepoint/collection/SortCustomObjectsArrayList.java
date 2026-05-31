package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// User defined class
class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class SortCustomObjectsArrayList {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Alice", 28));
		employees.add(new Employee(102, "Bob", 32));
		employees.add(new Employee(103, "Eve", 25));
		employees.add(new Employee(104, "David", 30));

		System.out.println("Original List:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		// Sorting the list based on name attribute
		Collections.sort(employees, Comparator.comparing(Employee::getName));

		System.out.println("\nSorted List (by name):");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
