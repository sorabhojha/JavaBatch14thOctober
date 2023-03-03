package com.grotechminds.java;

public class VolatileTest {
	private static volatile int variable = 0;

	public static void main(String[] args) {
		new FirstClass().start();
		new SecondClass().start();
	}

	static class FirstClass extends Thread {
		@Override
		public void run() {
			for(int i=0; i<50; i++) {
				++variable;
				System.out.println(variable);
			}
		}
	}

	static class SecondClass extends Thread {
		@Override
		public void run() {
			for(int i=0; i<50; i++) {
				++variable;
				System.out.println(variable);
			}
		}
	}
}