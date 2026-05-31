package com.javacodepoint.collection;

import java.util.ArrayList;

public class ArrayListToStringArrayDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		arrayList.add("Programming");

		// Converting ArrayList to String array
		String[] stringArray = arrayList.toArray(new String[arrayList.size()]);

		// Printing the string array
		System.out.println("String Array:");
		for (String str : stringArray) {
			System.out.println(str);
		}
	}
}
