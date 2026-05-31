package com.javacodepoint.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class StudentClass implements Comparable<StudentClass> {
    String name;
    int age;

    public StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentClass other) {
        return this.age - other.age; // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CollectionSort4 {
	
	public static void main(String[] args) {
        List<StudentClass> students = Arrays.asList(
            new StudentClass("Alice", 22),
            new StudentClass("Bob", 20),
            new StudentClass("Charlie", 23)
        );

        System.out.println("Original List: " + students);

        // Sort the list by natural order (age)
        Collections.sort(students);

        System.out.println("Sorted List by Age: " + students);
    }
}
