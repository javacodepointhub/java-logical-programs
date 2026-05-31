package com.javacodepoint.series;

public class OddNumbersSeries {
	
	public static void printOddSeries(int limit) {
		System.out.print("Odd Numbers Series: ");
		for (int i = 1; i <= limit; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int limit = 10;
		printOddSeries(limit);
	}
}
