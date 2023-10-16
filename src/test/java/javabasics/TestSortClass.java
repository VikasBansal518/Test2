package javabasics;

import java.util.*;

import org.testng.annotations.Test;

public class TestSortClass { 
	@Test
	public static void test(){  
		ArrayList<Student> al=new ArrayList<Student>(); 
		al.add(new Student(106,"Ajay",27)); 
		al.add(new Student(101,"Vijay",23));   
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}  
	
}  