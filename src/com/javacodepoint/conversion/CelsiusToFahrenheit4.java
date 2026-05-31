package com.javacodepoint.conversion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusToFahrenheit4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedFahrenheit = decimalFormat.format(fahrenheit);
        System.out.println("Temperature in Fahrenheit: " + formattedFahrenheit);
    }
}
