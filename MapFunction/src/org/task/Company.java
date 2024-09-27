package org.task;

import java.util.*;
import java.util.Map.Entry;

public class Company {
    public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("GOAT",10);
		m.put("JaiBhim",9);
		m.put("Maveeran",1);
		m.put("Valimai",2);
		m.put("Joe",8);
		m.put("I",9);
		m.put(null, 6);
		System.out.println(m);
		
		Map<String,Integer> m1=new LinkedHashMap();
		m1.put("GOAT",10);
		m1.put("JaiBhim",9);
		m1.put("Maveeran",1);
		m1.put("Valimai",2);
		m1.put("Joe",8);
		m1.put("I",9);
		m1.put(null, 6);
		System.out.println(m1);
		
		Map<String,Integer> m2=new TreeMap();
		m2.put("GOAT",10);
		m2.put("JaiBhim",9);
		m2.put("Maveeran",1);
		m2.put("Valimai",2);
		m2.put("Joe",8);
		m2.put("I",9);
		System.out.println(m2);
		

		Map<String,Integer> m3=new Hashtable();
		m3.put("GOAT",10);
		m3.put("JaiBhim",9);
		m3.put("Maveeran",1);
		m3.put("Valimai",2);
		m3.put("Joe",8);
		m3.put("I",9);
		System.out.println(m3);
		
		int size = m.size();
		System.out.println(size);
		
		
		boolean containsKey = m3.containsKey("Joe");
		System.out.println(containsKey);
		
		
		boolean containsValues = m3.containsValue(10);
		System.out.println(containsValues);
		
	    Integer remove = m2.remove("Maveeran");
		System.out.println(remove);
		System.out.println(m2);
		
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		
		Collection<Integer> values = m.values();
		System.out.println(values);
		
		Set<Entry<String, Integer>> entrySet = m3.entrySet();
	    for(Entry<String,Integer>m4:entrySet) {
//		System.out.println(m4);
		
//		System.out.println(m4.getKey());
	    	
	    	System.out.println(m4.getValue());
	    }
		
		
		
		
		
		
		
		
		
	}
}
