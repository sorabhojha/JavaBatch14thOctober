package com.grotechminds.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CollectionsSessionQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//priorityQueue();
		//arrayDeque();
		arrayBlockingQueue();
	}

	public static void priorityQueue() {
		//Order will be not maintained.
		//Comparable or external comparator is used
		//add - throws exception, offer does not
		//Default size is 10+1. 
		//Null entries are supported.
		
		Queue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Ball");
		priorityQueue.add("Apple");
		priorityQueue.add("Dog");
		priorityQueue.add("Cat");
		priorityQueue.add(null);
		System.out.print(priorityQueue);
	}
	
	//Default size is 16+1
	public static void arrayDeque() {
		Deque<String> deque = new ArrayDeque<String>();
		deque.addFirst("Apple");
		deque.addFirst("Ball");
		deque.addLast("Cat");
		deque.addLast("Dog");
		deque.addLast(null);
		System.out.print(deque);
	}
	
	//Thread safe
	//Bounded or Unbounded
	//Nulls are not supported.
	//Maintains the insertion order.
	public static void arrayBlockingQueue() {
		BlockingQueue<String> deque = new ArrayBlockingQueue<String>(5);
		deque.add("1");
		deque.add("2");
		deque.add("3");
		deque.add("4");
		deque.add("5");
		deque.offer("6");
		System.out.print(deque);
	}
}
