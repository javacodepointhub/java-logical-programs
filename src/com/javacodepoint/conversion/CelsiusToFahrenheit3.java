package com.javacodepoint.conversion;

import java.math.BigDecimal;
import java.util.Scanner;

public class CelsiusToFahrenheit3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        BigDecimal fahrenheit = BigDecimal.valueOf((celsius * 9 / 5) + 32);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
