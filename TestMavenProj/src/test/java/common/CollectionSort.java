package common;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CollectionSort {
	
    @Test
	public static void sort() {
		
		List<String> l=new LinkedList<String>();
		l.add("Vikas5");
		l.add("Vikas11");
		l.add("Vikas3");
		l.add("Vikas12"); 
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println("List items in ascending order: "+l);

		Collections.sort(l, Collections.reverseOrder());
		System.out.println("List items in descending order: "+l);
		
		Assert.assertTrue(true);
	}

}
