package com.grotechminds.java;

public class MultipleThreadsExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaThreadExample ex = new JavaThreadExample(1);
		ex.setPriority(Thread.MAX_PRIORITY);
		
		JavaThreadExample ex1 = new JavaThreadExample(2);
		ex.setPriority(Thread.MIN_PRIORITY);
		
		ex.start();
		ex1.start();
	}
}
