package com.javacodepoint.series;

import java.util.Scanner;

/**
 * Series pattern: 1, 2, 5, 10, 17
 * 
 * @author javacodepoint.com
 *
 */
public class SeriesPattern2 {

	public static void main(String[] args) {
		
		// Create scanner object to read user inputs
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of elements you want in the series: ");
		int n = sc.nextInt();
		
		System.out.print("Series: ");
		for (int i = 0; i < n; i++) {
			
			// Calculate the element of the series
			int element = (i*i) + 1;
			
			// Print the element with comma(,) separator
			System.out.print(element + ", ");
		}
	}
}
