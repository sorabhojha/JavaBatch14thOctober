package com.grotechminds.java;

public class NestedLoopPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		for (int i =1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print('*'+" ");
			}
			System.out.println("");
		}
	}
}