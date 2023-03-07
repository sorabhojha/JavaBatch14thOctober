package com.grotechminds.advancedjava;

public class DoublyLinkedList {
	
	Node head;
	class Node {
		int data;
		Node prev;
		Node next;
		
		Node(int value) {this.data = value;}
	}

	
	//O[1]
	public void pushToBegining(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;
		
		if (head!=null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	public void insertAfterNode(Node previous, int data) {
		if(previous == null) {
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = previous.next;
		previous.next = newNode;
		newNode.prev = previous;
		
		if (newNode.next!=null) {
			newNode.next.prev = newNode;
		}
	}
	
	public void insertAtTheEnd(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		Node last = head;
		while(last.next !=null) {
			last = last.next;
		}
		
		last.next = newNode;
		newNode.prev = last;
	}
	
	public void insertBeforeNode(Node before, int data) {
		Node newNode = new Node(data);
		newNode.next = before;
		newNode.prev = before.prev;
		before.prev = newNode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//At the front of DLL
		
	}

}
