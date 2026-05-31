package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AdvancedExponentialSearch {
	public static int exponentialSearch(List<Employee> employees, int key) {
		int n = employees.size();

		// If the key is at the first position
		if (employees.get(0).getId() == key) {
			return 0;
		}

		// Find the range for Binary Search
		int i = 1;
		while (i < n && employees.get(i).getId() <= key) {
			i *= 2;
		}

		// Perform Binary Search in the found range
		return binarySearch(employees, i / 2, Math.min(i, n - 1), key);
	}

	private static int binarySearch(List<Employee> employees, int low, int high, int key) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (employees.get(mid).getId() == key) {
				return mid;
			}

			if (employees.get(mid).getId() < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Alice"));
		employees.add(new Employee(102, "Bob"));
		employees.add(new Employee(103, "Charlie"));
		employees.add(new Employee(104, "David"));

		int key = 103;

		// Sort employees by ID
		employees.sort(Comparator.comparingInt(Employee::getId));

		int result = exponentialSearch(employees, key);

		if (result != -1) {
			System.out.println("Employee found: " + employees.get(result));
		} else {
			System.out.println("Employee not found.");
		}
	}
}
