package com.javacodepoint.programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		//Initiating two integer numbers
		
		int x = 20, y=30;
		
		//Print both number before swapping
		System.out.println("x = "+x+", y= "+y);
		
		//Logic to swap these numbers without using a third variable
		
		x = x + y;		
		y = x - y;		
		x = x - y;
		
		//Printing the both number again after swapping
		System.out.println("x = "+x+", y= "+y);

	}

}
