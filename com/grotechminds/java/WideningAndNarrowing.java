package com.grotechminds.java;

public class WideningAndNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intVariable1 = 1234;
		long longVariable1 = intVariable1;  // Widening 
		
		long longVariable2 = 1234567l;
	    int intVariable2 = (int)longVariable2; // % - Modulo Operation - Narrowing
	    
	    char charVariable1 = 'A';
	    int intVariable3 = (int)charVariable1; //Incompatible types Narrowing
	    byte byteVariable = 123;
	    
	    int product = (charVariable1*intVariable3)*byteVariable; // Auto-promotion
	    
	    System.out.println(longVariable1);
	    System.out.println(intVariable2);
	    System.out.println(intVariable3);
	}

}
