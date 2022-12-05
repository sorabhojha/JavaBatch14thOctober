package com.grotechminds.advancedjava;

import com.grotechminds.java.Student;
public class AccessSpecifiersAdvancedJava extends Student{

	public AccessSpecifiersAdvancedJava(String name, Integer age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiersAdvancedJava s = new AccessSpecifiersAdvancedJava("Name-1", 8, "Address1");
		s.introduce();
	}
}
