package com.javacodepoint.collection;

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
	private List<T> list = new ArrayList<>();

	public void push(T item) {
		list.add(item);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return list.remove(list.size() - 1);
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return list.get(list.size() - 1);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}
}

public class StackWithArrayListDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Peek: " + stack.peek());
		System.out.println("Stack size: " + stack.size());

		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());

		System.out.println("Is stack empty? " + stack.isEmpty());
	}
}
