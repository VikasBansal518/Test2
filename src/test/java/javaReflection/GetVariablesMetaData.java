package javaReflection;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetVariablesMetaData{
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException { 
		
		ClassReflectionBase classVar = new ClassReflectionBase(); 
		Class classObjVar = classVar.getClass();
		
		Field[] field1= classObjVar.getDeclaredFields();
		 
		for(Field field : field1) { 
		System.out.println("Variable name : "+field.getName());
		System.out.println("Datatypes of the variable :"+field.getType());
		
		int accessModifiers = field.getModifiers();
		System.out.println("Access Modifiers of the variable : "+Modifier.toString(accessModifiers));
		System.out.println("Value of the variable : "+field.get(classVar));
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *") ;
		}
		}
}


