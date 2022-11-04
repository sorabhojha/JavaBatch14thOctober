package com.grotechminds.java;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Unboxing
		Integer integerVariable = new Integer(5);
		int abc = integerVariable.intValue();
		System.out.print(abc);
		
		Integer wrapperValue = Integer.valueOf(abc);
		System.out.print(wrapperValue);
	}
}
