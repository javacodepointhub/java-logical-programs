package com.javacodepoint.game;

import java.util.Arrays;
import java.util.List;

public class WordSearchSolver {
    private char[][] grid;
    private List<String> wordList;

    public WordSearchSolver(char[][] grid, List<String> wordList) {
        this.grid = grid;
        this.wordList = wordList;
    }

    public void solveWordSearch() {
        for (String word : wordList) {
            boolean found = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (searchFromPosition(word, i, j)) {
                        found = true;
                        System.out.println("Word \"" + word + "\" found at position (" + i + "," + j + ")");
                    }
                }
            }
            if (!found) {
                System.out.println("Word \"" + word + "\" not found!");
            }
        }
    }

    private boolean searchFromPosition(String word, int row, int col) {
        if (word.length() == 0) {
            return true; // Empty word is always found
        }

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return false; // Out of bounds
        }

        if (grid[row][col] != word.charAt(0)) {
            return false; // First letter doesn't match
        }

        char original = grid[row][col];
        grid[row][col] = '*'; // Mark the cell as visited

        // Explore all eight directions
        boolean found = searchFromPosition(word.substring(1), row - 1, col)
                || searchFromPosition(word.substring(1), row + 1, col)
                || searchFromPosition(word.substring(1), row, col - 1)
                || searchFromPosition(word.substring(1), row, col + 1)
                || searchFromPosition(word.substring(1), row - 1, col - 1)
                || searchFromPosition(word.substring(1), row - 1, col + 1)
                || searchFromPosition(word.substring(1), row + 1, col - 1)
                || searchFromPosition(word.substring(1), row + 1, col + 1);

        grid[row][col] = original; // Restore the cell

        return found;
    }
    
    public void printGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
    
    public static void main(String[] args) {
        char[][] grid = {
            { 'A', 'B', 'C' },
            { 'D', 'E', 'F' },
            { 'G', 'H', 'I' }
        };
        List<String> wordList = Arrays.asList("ABC", "FI", "EH", "ADG");

        WordSearchSolver solver = new WordSearchSolver(grid, wordList);
        solver.printGrid();
        solver.solveWordSearch();
    }
}
