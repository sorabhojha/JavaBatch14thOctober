package com.grotechminds.java;

public class ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students harshit = new Students(25, "Harshit", "Jaipur");
        harshit.introduce();
        
        Students.institution="GroTech Minds"; 
        
        Students sabana = new Students(25, "Sabana" ,"Kolkata");
        sabana.introduce(); 
        
        Students.institution="GroTech Minds 2"; 
        harshit.introduce();
        sabana.introduce();
	}
}

class Students {
	int age;
	String name;
	String address;
	static String institution;
	
	Students(int age, String nameFromC, String addressFromC){
		this.age = age;
		this.name = nameFromC;
		this.address = addressFromC;
	}

	public boolean introduce() {
		int b = 0;
		System.out.println("Hi !! My name is "+name+ 
				" Age is: "+age+ "Address is: "+address+ 
				" Institute: "+institution);
		System.out.print(b);
		return true;
	}
}
