package com.grotechminds.java;

public class Student{
	public String name;
	public Integer age;
	public String address;
	
	public Student (){
	}
	
	public Student (String name){
		this.name = name;
	}
	
	public Student(String name, Integer age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void introduce() {
		System.out.print("Hi!! I am " + name + 
				" of the age: "+ age + "living at: "+address);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Name-1", 8, "Address1");
		s.introduce();
	}
}
