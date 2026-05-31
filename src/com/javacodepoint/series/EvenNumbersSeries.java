package com.javacodepoint.series;

public class EvenNumbersSeries {

	public static void printEvenSeries(int limit) {
		System.out.print("Even Numbers Series: ");
		for (int i = 2; i <= limit; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int limit = 10;
		printEvenSeries(limit);
	}
}
