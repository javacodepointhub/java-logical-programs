package com.javacodepoint.collection;

import java.util.LinkedList;

public class BasicQueue<T> {
	private LinkedList<T> queue;

	public BasicQueue() {
		queue = new LinkedList<>();
	}

	// Method to enqueue (add) an element to the end of the queue
	public void enqueue(T data) {
		queue.addLast(data);
	}

	// Method to dequeue (remove) and return the element from the front of the queue
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue.removeFirst();
	}

	// Method to check if the queue is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// Method to get the size of the queue
	public int size() {
		return queue.size();
	}

	public static void main(String[] args) {
		BasicQueue<Integer> myQueue = new BasicQueue<>();

		// Enqueue elements
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);

		System.out.println("Queue Size: " + myQueue.size());

		// Dequeue elements
		System.out.println("Dequeued Element: " + myQueue.dequeue());
		System.out.println("Dequeued Element: " + myQueue.dequeue());

		System.out.println("Queue Size after Dequeue: " + myQueue.size());
	}
}
