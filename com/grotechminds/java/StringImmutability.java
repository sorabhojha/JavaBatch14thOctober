package com.grotechminds.java;

public class StringImmutability {

	public static void main(String[] args) {
		String abc = "GroTechMinds";
		// String constant pool -> Heap 
		String abc1 = "GroTechMinds";
		
		String abc2 = new String("GroTechMinds");
		// main()
		// Three references abc, abc1, abc2, and abc3 will be created inside the stack frame
		// Objects for each created in the heap
		// Heap -> outside of the string constants pool. 
		
		String abc3 = new String("GroTechMinds");
		String abc4 = abc3;
		
		//Immutability
		abc3 = abc3.concat(" Software solutions Pvt Ltd.");
		//System.out.println(abc2);
		
		// Wrapper classes follow same behavior 
		//Integer, Long, Double, String etc 
		
		StringBuffer sbf = new StringBuffer("StringOne");
		StringBuffer sbf1 = sbf;
		sbf.append(" Hello !!");
		
		System.out.println(abc3);
		System.out.println(abc4);
		
	}
}
