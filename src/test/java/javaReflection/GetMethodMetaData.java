package javaReflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethodMetaData {
	public static void main (String[] args) {
	
		Class classObj = ClassReflectionBase.class;

		Method[] methods=classObj.getDeclaredMethods();

		for(Method method : methods) { 
		// Print the method names
		System.out.println("Name of the method : "+method.getName());
		
		// Print return type of the methods 
		System.out.println("Return type of the method : "+method.getReturnType());
		
		//Get the access modifier list and print
		int modifierList = method.getModifiers(); 
		System.out.println ("Method access modifiers : "+Modifier.toString(modifierList));
		
		// Get and print parameters of the methods 
		Class[] paramList= method.getParameterTypes(); 
		System.out.print ("Method parameter types : "); 
		for (Class class1 : paramList){ 
			System.out.println(class1.getName()+" ");
		}
        System.out.println();
		
		// Get and print exception thrown by the method 
		Class[] exceptionList = method. getExceptionTypes(); 
		System.out.print("Excpetion thrown by method :"); 
		for (Class class1 : exceptionList) {
			System.out.println (class1.getName() +" ");
		} 
		System.out.println(); 
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		
		}
 
	}
}


