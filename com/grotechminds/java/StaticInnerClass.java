package com.grotechminds.java;

public class StaticInnerClass {

	static int a = 10;
	
	static class InnerStaticClass{
		void printStatement() {
			System.out.print("A Value:"+a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass.a = 20;
		StaticInnerClass.InnerStaticClass obj = new StaticInnerClass.InnerStaticClass();
	}
}
