package com.grotechminds.advancedjava;

class Node  {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class LinkedListExample {
	//Address to the head element - Node
	Node head;
	
	public void printNodes() {
		Node n = head;
		while (n!=null) {
			System.out.print(n.data);
			n = n.next;
		}	
	}
	
	public static void main(String[] args) {
		LinkedListExample llEx = new LinkedListExample();
		llEx.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llEx.head.next = second;
		second.next = third;
		
		llEx.printNodes();
	}
}
