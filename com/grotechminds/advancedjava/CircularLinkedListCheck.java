package com.grotechminds.advancedjava;

public class CircularLinkedListCheck {
	
	Node head;
	
	class Node{
		int data;
		Node next;
	}

	public void isCircular() {
		if (head == null)
			System.out.print("Linked list does not contain any elements");
		
		Node node = head.next; //Start from 2nd elements
		
		while (node !=null && node !=head)
			node = node.next;
		
		if (node==head)
			System.out.print("Circular LL");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
