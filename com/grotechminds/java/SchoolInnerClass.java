package com.grotechminds.java;

public class SchoolInnerClass {

	private int a = 10;
	
	class Classroom {
		int b = 20;
		public void getAandB() {
			System.out.print("A and B Values: A"+a+" B:"+b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolInnerClass sc = new SchoolInnerClass();
		SchoolInnerClass.Classroom cl = sc.new Classroom();
		cl.getAandB();
	}

}
