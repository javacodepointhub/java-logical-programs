package com.javacodepoint.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// Taking input from the user to check whether number is Armstrong

		System.out.println("Enter a number to check Armstrong :");

		// Reading user input using Scanner object
		int number = new Scanner(System.in).nextInt();
		
		if(checkArmstrong(number)) {
			System.out.println("The given number is an Armstrong number.");
		}else {
			System.out.println("The given number is not an Armstrong number.");
		}
		
	}
	
	/*
	 * Method to check Armstrong number
	 */
	public static boolean checkArmstrong(int number) {
	    
		int sumOfCube = 0;
		int temp = number;    
	    while(number > 0){
	    	
	    	//Getting last digit 
	        int a = number % 10;  
	        
	        //Removing last digit from number  
	        number = number / 10;  
	        
	        //Calculating sum of cubes of digits    
	        sumOfCube = sumOfCube + (a*a*a); 
	    } 
	    
	    if(temp == sumOfCube) {
	    	return true;
	    }
	    
	    return false;
	}

}
