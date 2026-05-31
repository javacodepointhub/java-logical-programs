package com.javacodepoint.programs;

import java.util.Scanner;

public class LCMProgram {

	  public static long findLCM(int n1, int n2) {
	     // declare temporary variable to store lcm
	     long minMultiple = 0;

	     // find smallest and largest number 
	     int smallest = (n1<n2) ? n1 : n2;
	     int largest = (n1>n2) ? n1 : n2;

	     // assign smallest number to minMultiple
	     minMultiple = smallest;

	     // loop
	     while(true) {
	        if(minMultiple % largest == 0)
	            return minMultiple;
	        minMultiple = minMultiple + smallest ;
	     }
	  }

	  public static void main(String[] args) {

	     // declare variables
	     int number1 = 0;
	     int number2 = 0;
	     long lcm = 0;

	     // create Scanner class object 
	     Scanner scan = new Scanner(System.in);
	
	     // take input
	     System.out.print("Enter two integer numbers::");
	     number1 = scan.nextInt();
	     number2 = scan.nextInt();

	     // find LCM of both numbers
	     lcm = findLCM(number1, number2);

	     // display LCM value
	     System.out.println("LCM(" + number1
	           + "," + number2 + ") = " + lcm );

	     // close Scanner class object
	     scan.close();
	  }
	}
