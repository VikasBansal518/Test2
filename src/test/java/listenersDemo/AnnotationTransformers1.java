package listenersDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformers1 implements IAnnotationTransformer {

	public boolean isTestRunning(ITestAnnotation ins) 
	{
		if(ins.getAlwaysRun())
		{
			return true;
		}
		return false;
	}
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
			if(annotation.getAlwaysRun())
				annotation.setEnabled(false);
			
		/*
		 * String[] groupNames =annotation.getGroups();
		 * 
		 * System.out.println(groupNames.toString());
		 * 
		 * String groupNameToSkip = "aplhaTest";
		 * 
		 * if(groupNames[0].contains(groupNameToSkip)){
		 * System.out.println("found group name"); annotation.setEnabled(false); }
		
	  		
	  		 if(testMethod.getName().equalsIgnoreCase("test1")) {
	  			annotation.setEnabled(false);
	  	    }    */
					
	}

}
