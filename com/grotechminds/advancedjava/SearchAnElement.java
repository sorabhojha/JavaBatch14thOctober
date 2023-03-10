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
	
	public void findMiddlePoint() {
		//Approach 1 
		//Traverse all the elements and find the total length
		//Find the middle element - Total length / 2
		//Traverse from head to the middle element
		
		//Approach 2
		//Head - Starting point
		//Take 2 pointers. One pointer will jump one position, whereas other pointer will jump 2 positions. 
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer!=null && fastPointer.next!=null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.print("Middle element is: "+slowPointer.data);
	}
	
	//Implement stack using doubly linked list. insert(), fetch()
	
	
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
