package com.javacodepoint.series;

public class SquareNumbersSeries {
	
	public static void printSquareSeries(int limit) {
		System.out.print("Square Numbers Series: ");
		for (int i = 1; i <= limit; i++) {
			int square = i * i;
			System.out.print(square + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int limit = 10;
		printSquareSeries(limit);
	}
}
