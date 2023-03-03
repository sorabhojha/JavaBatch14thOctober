package com.grotechminds.java;

public class LocalInnerClasses {

	int b = 12;
	public void examplemethod() {
		int a = 10;
		class LocalClass {
			void msg() {
				System.out.print("Output from local inner class method"+a+b);
			}
		}
		
		LocalClass cl = new LocalClass();
		cl.msg();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClasses cl = new LocalInnerClasses();
		cl.examplemethod();
	}

}
