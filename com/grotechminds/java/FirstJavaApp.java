package com.grotechminds.java;

public class FirstJavaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String institution = "GroTech Minds"; 
        
		Students harshit = new Students(25, "Harshit", "Jaipur", institution);
        harshit.introduce();
        
        Students sabana = new Students(25, "Sabana" ,"Kolkata", institution);
        sabana.introduce();       
	}
}

class Students {
	int age;
	String name;
	String address;
	String institution;
	
	Students(int age, String nameFromC, String addressFromC, String institutionFromC){
		this.age = age;
		this.name = nameFromC;
		this.address = addressFromC;	
		this.institution = institutionFromC;
		this.introduce();
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
