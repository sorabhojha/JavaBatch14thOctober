package com.grotechminds.advancedjava;

public class LinkedListExample {
	
	//Address to the head element - Node
	static Node head;
	public class Node  {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void printNodes() {
		Node n = head;
		while (n!=null) {
			System.out.print(n.data);
			n = n.next;
		}	
	}
	
	public static void main(String[] args) {	
	}
}
