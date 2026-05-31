package com.javacodepoint.conversion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitToCelsius3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String formattedCelsius = decimalFormat.format(celsius);
		System.out.println("Temperature in Celsius: " + formattedCelsius);
	}
}
