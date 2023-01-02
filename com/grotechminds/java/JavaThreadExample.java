package com.grotechminds.java;

public class JavaThreadExample extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<550000; i++) {
			System.out.println("Running from inside a Thread - "+i);
		}
	}
}
