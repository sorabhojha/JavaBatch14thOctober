package com.grotechminds.java;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Runnable run = new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("Running  from Inside a Thread"+a);
			}
		};
		
		Thread d = new Thread(run);
		d.start();

	}

}
