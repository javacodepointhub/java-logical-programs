package com.javacodepoint.stringarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringChainFormation {

    // Method to check if the given words can form a valid chain
    public static boolean canFormStringChain(String[] words) {
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, Integer> outDegree = new HashMap<>();
        Map<Character, List<String>> adjacencyList = new HashMap<>();
        Set<Character> uniqueChars = new HashSet<>();

        // Build graph representation
        for (String word : words) {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            
            outDegree.put(first, outDegree.getOrDefault(first, 0) + 1);
            inDegree.put(last, inDegree.getOrDefault(last, 0) + 1);

            adjacencyList.computeIfAbsent(first, k -> new ArrayList<>()).add(word);
            uniqueChars.add(first);
            uniqueChars.add(last);
        }

        // Check Eulerian Path conditions
        int startCount = 0, endCount = 0;
        for (char c : uniqueChars) {
            int in = inDegree.getOrDefault(c, 0);
            int out = outDegree.getOrDefault(c, 0);

            if (out - in == 1) {
                startCount++;
            } else if (in - out == 1) {
                endCount++;
            } else if (in != out) {
                return false;
            }
        }

        return (startCount == 1 && endCount == 1) || (startCount == 0 && endCount == 0);
    }

    public static void main(String[] args) {
        String[] words = {"apple", "elephant", "tiger", "rat"};

        if (canFormStringChain(words)) {
            System.out.println("Yes, the words can form a valid chain.");
        } else {
            System.out.println("No, a valid chain cannot be formed.");
        }
    }
}