package com.javacodepoint.patterns;

public class HollowDiamondPattern {
	
	public static void main(String[] args) {
		int rows = 5;
		int spaces = rows - 1;

		// Upper half of the hollow diamond
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			spaces--;

			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		spaces = 1;

		// Lower half of the hollow diamond
		for (int i = 1; i <= rows - 1; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			spaces++;

			for (int k = 1; k <= 2 * (rows - i) - 1; k++) {
				if (k == 1 || k == 2 * (rows - i) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
