package javaReflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetConstructorMetaData {
	public static void main (String[] args) {

		Class classObj=ClassReflectionBase.class;

		Constructor[] constructorList = classObj.getDeclaredConstructors();
		
		for (Constructor constructor : constructorList) {
			// Print all name of each constructor
			System.out.println("Constrcutor name : "+constructor.getName());
			
			//Get and print access modifiers of each constructor 
			int modifiers= constructor.getModifiers(); 
			System.out.println ("Constrctor modifier : "+Modifier.toString(modifiers));
			
			// Get and print parameter types 
			Class[] paramList=constructor.getParameterTypes();
			System.out.print ("Constrctor parameter types :"); 
			for (Class class1 : paramList) { 
				System.out.println(class1.getName() +" ");
			}
			System. out.println();

			// Get and print exception thrown by constructors
			Class[] exceptionList=constructor.getExceptionTypes();
			System.out.println("Exception thrown by constructors :"); 
			for (Class class1 : exceptionList) { 
				System.out.println(class1.getName() +" ");
			} 
			System.out.println();
			System.out.println("*******************************************");
			
		}
	}
}


