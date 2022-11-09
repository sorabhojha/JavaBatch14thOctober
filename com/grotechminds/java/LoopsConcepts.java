package com.grotechminds.java;

public class LoopsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While - For - For-each - do-while 
		
		//Lets Iterate a Character array:
		char[] charArrayVariable = {'a','b','c'};
		int lengthOfTheArray = charArrayVariable.length; //Array Object has property - length
		
		//continue / break
		//For Loop - 3
		for(int i=0; i<=lengthOfTheArray-1; i++) {
			if(i==0) {
				continue;
			}
			if(i==1) {
				break;
			}
			System.out.println(charArrayVariable[i]);
		}
		
		for(char ch: charArrayVariable) { // For each character ch - part of array xyz
			System.out.println(ch);
		}
		
		int i=0;
		while(i<=lengthOfTheArray-1) {
			System.out.println(charArrayVariable[i]);
			i++;
		}
		
		// do-while
		int j=0;
		do{
			System.out.println(charArrayVariable[j]);
			j++;
		}while(j<=lengthOfTheArray-1);
	}
}


// Iteration - Simple Example 
// a. Integer
//   b. String 


//Iterate an Array of student names and for each student, 
//create an object of the Student class. 
// String[] student = {};


