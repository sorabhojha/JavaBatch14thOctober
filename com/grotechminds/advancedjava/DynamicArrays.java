package com.grotechminds.advancedjava;

public class DynamicArrays {
	
	
	private int[] items;
	private int count;
	
	public DynamicArrays(int length) {
		
		items = new int[length];
	}
	
	public void print() {
		
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
	
	//Check if the array is full and resize it. Add the element to the count value available.
	public void insert(int number) {
	
		//If the array is full, resize it
		if(items.length == count) {
			
			//Create a new array of double the capacity
			int[] newItems = new int[count*2];
			
			//Copy all the existing elements from the items Array to the newItems array
			for(int i=0;i<count;i++) {
				newItems[i]=items[i];
			}
			
			//Update the reference of the array with the new array value
			items=newItems;
		}
		
		//If an item is added to the end
		items[count]=number;
		count++;
		
	}
	
	//Delete
	//Validate the index, move each element by one step back and update the count value. 
	public void removeAt(int index) {
		
		if(index<0 || index>=count ) {
			throw new IllegalArgumentException();
		}	
		
		for(int i=index;i<count;i++) {
			items[i]=items[i+1];
		}
		
		count--;
	}
	
	//Search
	public int indexOf(int number) {
		
		for(int i=0;i<count;i++) {
			if(number == items[i]) {
				return i;
			}
		}
		
		return -1;
		
	}
}