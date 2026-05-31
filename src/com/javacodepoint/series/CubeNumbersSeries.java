package com.javacodepoint.series;

public class CubeNumbersSeries {
	
	public static void printCubeSeries(int limit) {
		System.out.print("Cube Numbers Series: ");
		for (int i = 1; i <= limit; i++) {
			int cube = i * i * i;
			System.out.print(cube + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int limit = 5;
		printCubeSeries(limit);
	}
}
