package com.grotechminds.java;

public class AbstractClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new RTSquare();
		Shape s1 = Shape.getMeAnRtSquareObject();
		s.nameOfTheShape();
		
		s.perimeter();
	}

}

abstract class Shape {
	public void nameOfTheShape() {
		System.out.println("I am a Shape !!");
	}
	
	public abstract void perimeter();
	
	static RTSquare getMeAnRtSquareObject(){
		return new RTSquare();
	}
}

abstract class Square extends Shape{
	@Override
	public void perimeter() {
		//area
		System.out.println("4 times the length of a side");
	}
	
	abstract public void area();
}

class RTSquare extends Square{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("My area is 2 times the length of a side");
	}	
}















