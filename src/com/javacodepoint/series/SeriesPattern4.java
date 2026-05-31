package com.javacodepoint.series;

import java.util.Scanner;

/**
 * Series pattern: 3, 9, 27, 81, 243
 * 
 * @author javacodepoint.com
 *
 */
public class SeriesPattern4 {

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
			element = element * 3;

			// Print the element with comma(,) separator
			System.out.print(element + ", ");
		}
	}
}
