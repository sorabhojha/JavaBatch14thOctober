package com.grotechminds.advancedjava;

public class SearchAnElement {

	Node head;
	class Node{
		int data;
		Node next;
		Node(int x){
			data = x;
			next = null;
		}
	}
	
	public void insert(int number) {
		Node newNode = new Node(number);
		newNode.next = head;
		head = newNode;
	}
	
	public boolean search(int number) {
		Node current = head;
		while(current !=null) {
			if(current.data == number) {
				System.out.print("Found the element");
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	//1-2-3-4-5-6-7-8-9-10
	//7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchAnElement linkedList = new SearchAnElement();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		
		linkedList.search(3);
		
	}
}
