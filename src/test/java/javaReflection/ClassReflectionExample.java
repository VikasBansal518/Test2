package javaReflection;

public class ClassReflectionExample {
	public static void main (String[] args) throws ClassNotFoundException {
		//1 - By using Class.forname() method 
		Class c1 = Class.forName("ClassReflectionExample"); 
		//2- By using getClass() method 
		ClassReflectionExample guru99Obj = new ClassReflectionExample();
		Class c2 = guru99Obj.getClass();
		//3- By using .class 
		Class c3= ClassReflectionExample.class;
		}
	}
