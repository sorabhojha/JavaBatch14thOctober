package com.grotechminds.java;

public class JavaThreadExample extends Thread{

	Integer threadId;
	
	JavaThreadExample(Integer threadId){
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Running from inside a Thread - " + threadId + "Printing value: "+i);
		}
	}
}
