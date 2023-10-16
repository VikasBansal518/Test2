package javabasics;

public class ChildClass extends ParentClass {
	
	int num=10;
	static int age=17;
	ChildClass(){
		super();
		System.out.println("Child class Constructor");
		}
	
	public void display(){
		System.out.println("Child class display method");
		System.out.println(super.num);
		System.out.println(ChildClass.age);
		// get();
	}
	
	void get(){
		System.out.println("Child class get method");
	}
	
	public static void main(String...args) {
	//	ParentClass obj=new ParentClass();		
		ChildClass obj=new ChildClass();
	//	ParentClass obj=new ChildClass();
		
	//	ChildClass obj=(ChildClass) new ParentClass();
		
		obj.display();	
	//	obj.get();
	}

}
