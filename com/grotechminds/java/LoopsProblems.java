package com.grotechminds.java;

public class LoopsProblems {

	int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Forward Direction Iteration. 
		// List all the numbers from 20 to 80, with a difference of 5.
		for(int i=20; i<=80; i=i+5) {
			System.out.print(i+"\t");
			//What to do ? - Increment - by 5 
		}
		
		//Reverse Direction
		//List all the numbers from 100 to 0, with a difference of 5.
		for(int i = 100; i>=0; i=i-5) {
			if(i==90) {
				continue;
			}
			if(i==85) {
				break;
			}
			System.out.print(i+"\t");
		}
		
		
		//Count the number of vovels in a String
		String input = "abcdef";
		System.out.print(input);
		
		char[] inputCharArray = input.toCharArray();
		System.out.print(inputCharArray);
		int counter = 0;
		for(int i=0; i<inputCharArray.length; i++) {
			if(inputCharArray[i]=='a'||
					inputCharArray[i]=='e'||
					inputCharArray[i]=='i'||
					inputCharArray[i]=='o'||
					inputCharArray[i]=='u') {
				++counter;
			}
		}
		System.out.print(counter);
		
		
		//Liner Search Algorithm
		char ch = 'a';
		char[] inputArray = {'b','c','a','d'};
		for (int i=0; i<=inputArray.length-1; i++) {
			if(inputArray[i]==ch) {
				System.out.print("Found the Character at index: "+i);
				break;
			}
		}
		
	}
}
