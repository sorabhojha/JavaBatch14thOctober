package com.grotechminds.java;

public class JavaRunnableExample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<10000; i++) {
			System.out.println(i);
		}
	}
}
