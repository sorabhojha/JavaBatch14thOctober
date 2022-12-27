package com.grotechminds.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionsSessionSet {

	public static void hashSet() {
		//Based on a HashMap structure - Storing set values as keys
		//Default capacity - 16 - Load factor - 0.75
		//Does not store duplicates
		//Insertion Order is not maintained
		//Not synchronized
		List<String> li = new ArrayList<String>();
		li.add("Five");
		li.add("Six");
		li.add("Six");
		
		Set<String> set = new HashSet<String>(li);
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		
		System.out.print(set);
	}
	
	public static void linkedHashSet() {
		//Based on a HashMap structure - Storing set values as keys
		//Default capacity - 16 - Load factor - 0.75
		//Does not store duplicates
		//Insertion Order is maintained
		//Not synchronized
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add("Two");
		set.add("Three");
		set.add("Four");
		
		System.out.print(set);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashSet();
		linkedHashSet();
	}

}
