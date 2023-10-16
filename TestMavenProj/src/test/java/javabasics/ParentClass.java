package javabasics;

public class ParentClass {
	
	static final int num;
	ParentClass(){
		System.out.println("Parent class Constructor");
	}
	
	static {
		num=60;
	}
	
	void display(){
		System.out.println("Parent class display method");
	}
	

}
