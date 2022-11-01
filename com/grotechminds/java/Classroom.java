package com.grotechminds.java;

public class Classroom {
	
	int strength;
	int grade;
	String classTeacher;
	static int numberOfTotalClassrooms;
	
	Classroom(int strength, int grade, String classTeacher){
		this.strength = strength;
		this.grade = grade;
		this.classTeacher = classTeacher;
		++numberOfTotalClassrooms;
	}

	public void introduce() {
		System.out.print("Class Strength: "+strength+" Class Grade: "+grade+" Class Teacher Name: "+classTeacher);
	}
	
	public void createobjects() {
		Classroom eightGrade = new Classroom(35,8,"Mr. Vijay");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom nineGrade = new Classroom(45,9,"Mr. Amit");
		System.out.println(numberOfTotalClassrooms++);
		
		Classroom tenthGrade = new Classroom(55,10,"Mr. Sandep");
		nineGrade.createobjects();
		tenthGrade.createobjects();
		System.out.print("Total number of classes:"+numberOfTotalClassrooms);
	}

}
