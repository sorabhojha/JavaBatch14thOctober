package com.grotechminds.advancedjava;

import java.util.Stack;

public class ReverseOfALinkedList {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node (int dataFromCons) {
			data = dataFromCons;
			next = null;
		}
	}
	
	public void reverse() {
		Stack<Integer> stack = new Stack<>();
		
		Node temp = head;
		while(temp !=null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		
		temp = head;
		while (temp != null) {
			temp.data = stack.pop();
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
