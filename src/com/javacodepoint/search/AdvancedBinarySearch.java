package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdvancedBinarySearch {
	
	public static int binarySearch(List<Employee> employees, int key) {
		int low = 0;
		int high = employees.size() - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			Employee midEmployee = employees.get(mid);

			if (midEmployee.getId() == key) {
				return mid; // Key found
			} else if (midEmployee.getId() < key) {
				low = mid + 1; // Search in the right half
			} else {
				high = mid - 1; // Search in the left half
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Alice"));
		employees.add(new Employee(102, "Bob"));
		employees.add(new Employee(103, "Charlie"));

		// Sort the list by ID (Binary Search requires a sorted collection)
		Collections.sort(employees, Comparator.comparingInt(Employee::getId));

		int key = 102;

		int result = binarySearch(employees, key);

		if (result != -1) {
			System.out.println("Employee found: " + employees.get(result));
		} else {
			System.out.println("Employee not found.");
		}
	}
}
