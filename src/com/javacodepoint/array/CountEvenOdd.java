package com.javacodepoint.array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
