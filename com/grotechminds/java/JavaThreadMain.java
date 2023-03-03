package com.grotechminds.java;

public class JavaThreadMain {
	
	public static void runThreadClass() throws InterruptedException {
		JavaThreadExample th = new JavaThreadExample(1);
		th.setName("My First Thread");
		th.setPriority(7);
		th.start();
		Thread.sleep(1000);
		th.suspend();
		Thread.sleep(5000);
		th.resume();
		
		System.out.print(th.getName()+th.getPriority());
		th.join();
		System.out.print("After the join");
	}
	
	private static void runRunnableInterface() {
		// TODO Auto-generated method stub
		JavaRunnableExample run = new JavaRunnableExample();
		Thread t = new Thread(run);
		t.start();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		runThreadClass();
		runRunnableInterface();
	}
	
}
