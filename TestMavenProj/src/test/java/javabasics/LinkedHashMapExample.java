package javabasics;

import java.util.HashMap;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
	@SuppressWarnings("rawtypes")
	public static void main(String...args) {
	//LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer, String>();
	//HashMap<Integer, String> hm= new HashMap<Integer, String>();
    // TreeMap<Integer, String> hm= new TreeMap<Integer, String>();
		
		 Hashtable<Integer,String> hm = new Hashtable<>();

	hm.put(6, "Bangladesh");
	hm.put(1, "India");
	hm.put(2, "Australia");
	hm.put(4, "Pakistan");
	hm.put(5, "England");
	hm.put(3, "New Zealand");
	
	
	System.out.println(hm.size());
	System.out.println(hm.get(3));
	
	Set s=hm.entrySet();
	System.out.println(s);
	System.out.println(hm);

	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		@SuppressWarnings("unchecked")
		Map.Entry<Integer, String> m=(Map.Entry<Integer, String>)itr.next();
		System.out.println("Key: "+m.getKey()+" "+"Value: "+m.getValue());
	}
	
	}
	

}
