package javaReflection;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.sql.SQLException;

public final class ClassReflectionBase implements Serializable,Cloneable{
	
	public static int intVar1=111;
    protected static int intVar2=222;							
    static String stringVar1="abc.com";							
     static String stringVar2="Learning Reflection API";
     
     public ClassReflectionBase() throws ClassCastException ,ArithmeticException{  }	
     
     public ClassReflectionBase(int no) throws ClassCastException ,ArithmeticException{  }							
 	protected ClassReflectionBase(int no, String name) throws RemoteException ,SQLException{  }							
 	 ClassReflectionBase(int no, String name, String address) throws InterruptedException{  }							

     
     public int add(int firstElement, int secondElement , String result) 									
    		    throws ClassNotFoundException, ClassCastException{			
    		          System.out.println("Demo method 1 for Reflextion  API");		
    		          return 0;
    		    }	
    		    protected String search(String searchString) 			
    		    throws ArithmeticException, InterruptedException{			
    		        System.out.println("Demo method 2 for Reflection API");					
    				return null;					
    		    }	
    			static void delete(String deleteString) 					
    			throws SQLException{			
    			    System.out.println("Demo method 3 for Reflection API");					
    		    }	

	}


