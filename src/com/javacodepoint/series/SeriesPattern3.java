package com.javacodepoint.series;

import java.util.Scanner;

/**
 * Series pattern: 2, 4, 8, 16, 32
 * 
 * @author javacodepoint.com
 *
 */
public class SeriesPattern3 {

	public static void main(String[] args) {

		// Create scanner object to read user inputs
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of elements you want in the series: ");
		int n = sc.nextInt();

		// Initialize element
		int element = 1;
		System.out.print("Series: ");
		for (int i = 0; i < n; i++) {

			// Calculate the element of the series
			element = element * 2;

			// Print the element with comma(,) separator
			System.out.print(element + ", ");
		}
	}
}
