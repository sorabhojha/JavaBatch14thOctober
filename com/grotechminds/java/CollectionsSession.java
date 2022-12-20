package com.grotechminds.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class CollectionsSession {

	public static void arrayList() {
		//Dynamic - Growable Array - Default size as 10
				//Best suited for fetch oriented Application
				//O[1] - Fetch time complexity - get()
				//O[n] - Insertion time complexity - add()/remove()
				//Maintains the insertion order
				//Indexed 
				
				List<String> arrListFriends = new ArrayList<String>(25);
				arrListFriends.add("Rohit");
				arrListFriends.add("Satish");
				arrListFriends.add("Sandeep");
				arrListFriends.add("Sabana");
				arrListFriends.add("Nithin");
				arrListFriends.add("Dummy");
				
				System.out.println(arrListFriends.size());
				System.out.println(arrListFriends);
				
				System.out.println(arrListFriends.indexOf("Dummy"));
				arrListFriends.remove(5);
				
				System.out.println(arrListFriends);
				
				List<String> arrListFndsAndFamily = new ArrayList<String>(arrListFriends);
				arrListFndsAndFamily.add("Daddy");
				System.out.println(arrListFndsAndFamily);
	}
	
	public static void linkedList() {
		
		//Based on Doubly Linked Data Structure - Nodes - Bidirectional
		//Best suited for insertion operations (O[1]) - Less suited for fetch operations(O[n])
		//Maintains the insertion order
		//No Default size
		
		List<String> list = new LinkedList<String>();
		list.add("My Element 1");
		list.add("My Element 2");
		list.add("My Element 3");
		list.add("My Element 4");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayList();
		linkedList();
		
	}
}
