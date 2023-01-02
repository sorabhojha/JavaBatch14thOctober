package com.grotechminds.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceExamples {

	//Key - Value Pair 
	// Internal implementation is HashTable based.
	//Unique Keys
	//One null key is supported
	//Duplicate keys, override previous key's value
	// Initial capacity is 16 - Load factor of 0.75
	// HashMap is not Thread safe.
	// Elements are not in an order.
	
	public static void hashMapExample() {
		Map<String, String> map = new HashMap<>();
		map.put("Rohith", "123456");
		map.put("Sandeep", "123456");
		map.put("Sandeep", "1234567");
		map.put(null, "123456");
		map.put(null, null);
		
		System.out.print(map);
		System.out.print(map.size());
		
		for(String a : map.keySet()) {
			System.out.println("Key: "+a);
		}
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("Key:" + entry.getKey()+ " Value:"+ entry.getValue());
		}
	}
	
	//O[1]
	//Maintains the insertion order
	//16 - 0.75
	// Nulls allowed
	public static void linkedHashMap() {
		Map<String, String> linkedHm = new LinkedHashMap<>();
		linkedHm.put("Rohith", "123456");
		linkedHm.put("Sandeep", "1234567");
		linkedHm.put(null, "123456");
		
		System.out.print(linkedHm);
	}
	
	//Sorted in Nature - Order
	//Nulls are not supported
	// 16 - 0.75
	//Internal implementation - Red Black Trees
	//TreeMap is not thread safe
	public static void treeMap() {
		Map<String, String> treeMap = new TreeMap<>(new CustomComparator());
		treeMap.put("Zebra", "1");
		treeMap.put("Kite", "2");
		treeMap.put("Apple", "3");
		treeMap.put("Ball", "4");
		treeMap.put("Umbrella", "5");
		
		System.out.print(treeMap);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //hashMapExample();
        //linkedHashMap(); 
		//treeMap();
	}

}
