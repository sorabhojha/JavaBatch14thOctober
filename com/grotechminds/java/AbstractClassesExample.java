package com.grotechminds.java;

public class AbstractClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.perimeter();
	}

}

abstract class Shape {
	public void nameOfTheShape() {
		System.out.println("I am a Shape !!");
	}
	
	public abstract void perimeter();
}

class Square extends Shape{
	@Override
	public void perimeter() {
		System.out.println("4 times the length of a side");
	}
}
