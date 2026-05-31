package com.javacodepoint.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book {
	private int id;
	private String title;

	public Book(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Book{id=" + id + ", title='" + title + "'}";
	}
}

public class AdvancedFibonacciSearch {

	public static int fibonacciSearch(List<Book> books, int key) {
		int n = books.size();

		// Initialize Fibonacci numbers
		int fib2 = 0;
		int fib1 = 1;
		int fibM = fib2 + fib1;

		// Find the smallest Fibonacci number greater than or equal to n
		while (fibM < n) {
			fib2 = fib1;
			fib1 = fibM;
			fibM = fib2 + fib1;
		}

		int offset = -1;

		while (fibM > 1) {
			int i = Math.min(offset + fib2, n - 1);

			if (books.get(i).getId() < key) {
				fibM = fib1;
				fib1 = fib2;
				fib2 = fibM - fib1;
				offset = i;
			} else if (books.get(i).getId() > key) {
				fibM = fib2;
				fib1 = fib1 - fib2;
				fib2 = fibM - fib1;
			} else {
				return i; // Key found
			}
		}

		if (fib1 == 1 && books.get(offset + 1).getId() == key) {
			return offset + 1;
		}

		return -1; // Key not found
	}

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Java Basics"));
		books.add(new Book(102, "Data Structures"));
		books.add(new Book(103, "Algorithms"));
		books.add(new Book(104, "Design Patterns"));

		int key = 103;

		// Sort books by ID
		books.sort(Comparator.comparingInt(Book::getId));

		int result = fibonacciSearch(books, key);

		if (result != -1) {
			System.out.println("Book found: " + books.get(result));
		} else {
			System.out.println("Book not found.");
		}
	}
}
