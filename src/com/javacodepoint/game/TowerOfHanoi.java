package com.javacodepoint.game;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of disks: ");
		int numberOfDisks = scanner.nextInt();
		towerOfHanoi(numberOfDisks, 'A', 'C', 'B');
		scanner.close();
	}

	public static void towerOfHanoi(int disks, char source, char destination, char auxiliary) {
		if (disks == 1) {
			System.out.println("Move disk 1 from peg " + source + " to peg " + destination);
			return;
		}
		towerOfHanoi(disks - 1, source, auxiliary, destination);
		System.out.println("Move disk " + disks + " from peg " + source + " to peg " + destination);
		towerOfHanoi(disks - 1, auxiliary, destination, source);
	}
}
