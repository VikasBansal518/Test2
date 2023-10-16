package common;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Arraylistexample {
	
    @Test
	public static void sort() {
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("Vikas5");
		l.add("Vikas11");
		l.add("Vikas3");
		l.add("6"); 
		
		System.out.println(l.size());
		Assert.assertTrue(true);
	}

}
