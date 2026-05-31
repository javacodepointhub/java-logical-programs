package com.javacodepoint.conversion;

import java.util.Scanner;

public class FahrenheitToCelsius2 {

	public static double convertFahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		double celsius = convertFahrenheitToCelsius(fahrenheit);
		System.out.println("Temperature in Celsius: " + celsius);
	}
}
