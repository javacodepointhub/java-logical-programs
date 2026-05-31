package com.javacodepoint.game;

import java.util.Scanner;

/*
 * A classic two-player game where each player chooses rock, paper, or scissors.
 */
public class RockPaperScissorsGame {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Rock, Paper, Scissors Game!");
		System.out.println("Enter your choice (rock, paper, or scissors): ");
		String playerChoice = scanner.next().toLowerCase();

		String[] choices = { "rock", "paper", "scissors" };
		
		String computerChoice = choices[(int) (Math.random() * choices.length)];

		System.out.println("Computer chose: " + computerChoice);

		if (playerChoice.equals(computerChoice)) {
			System.out.println("It's a tie!");
		} else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
				|| (playerChoice.equals("paper") && computerChoice.equals("rock"))
				|| (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
		}

		scanner.close();
	}
}
