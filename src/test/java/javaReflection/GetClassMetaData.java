package javaReflection;
import java.lang.reflect.Modifier;

public class GetClassMetaData{
	public static void main (String [] args) throws ClassNotFoundException { 
		
		Class classObj = ClassReflectionBase.class;
		
		// Print name of the class 
		System.out.println("Name of the class is : " +classObj.getName());
		
		// Print Super class name
		System.out.println("Name of the super class is : " +classObj.getSuperclass().getName());
		
		// Get the list of implemented interfaces in the form of Class array using getInterface() method
		Class[] interfaceList = classObj.getInterfaces();
		
		System.out.print("Implemented interfaces are : ");
		for (Class class1 : interfaceList)	{
			System.out.println( class1.getName() + " ");
		}
		System.out.println();
		
		//Get access modifiers using get Modifiers() method and toString() method of java.lang.reflect.Modifier class
		int accessModifier= classObj.getModifiers(); 
		// Print the access modifiers
		System.out.println("Access modifiers of the class are : " +Modifier.toString(accessModifier));
		
		}
}


