package com.grotechminds.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//Iterator
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer value = itr.next();
			if(value.equals(2))
			 itr.remove();
		}
		System.out.println(list);
		
		
		ListIterator<Integer> listItr = list.listIterator();
		while(listItr.hasNext()) {
			Integer value = listItr.next();
			if(value.equals(1))
				listItr.remove();
		}
	}
}
