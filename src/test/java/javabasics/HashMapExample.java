package javabasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	@SuppressWarnings("rawtypes")
	public static void main(String...args) {
	HashMap<Integer, String> hm= new HashMap<Integer, String>();
	
	hm.put(1, "India");
	hm.put(2, "Australia");
	hm.put(3, "New Zealand");
	hm.put(4, "Pakistan");
	hm.put(5, "England");
	hm.put(6, "Bangladesh");
	
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
