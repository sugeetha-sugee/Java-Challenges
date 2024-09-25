package org.task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompanySet {
  public static void main(String[] args) {
	Set s= new HashSet();
	s.add(25);
	s.add("ss");
	s.add(true);
	s.add(16.25);
	s.add('s');
	s.add(16);
	s.add(25);
	s.add(null);
	System.out.println(s);
	
	Set s1= new LinkedHashSet();
	s1.add(25);
	s1.add("ss");
	s1.add(true);
	s1.add(16.25);
	s1.add('s');
	s1.add(16);
	s1.add(25);
	s1.add(null);
	System.out.println(s1);
	
	
	Set s2=new TreeSet();
	s2.add(324);
	s2.add(86);
	s2.add(76);
	s2.add(213);
	s2.add(987);
	s2.add(273);
	System.out.println(s2);
	
	Object remove=s1.remove('s');
	System.out.println(remove);
	System.out.println(s1);
	
	int size = s.size();
	System.out.println(size);
	
	Object addAll = s.addAll(s2);
	System.out.println(addAll);
	System.out.println(s);
	
	boolean contains=s2.contains(987);
	System.out.println(contains);
	
	for(Object s3:s2) {
		System.out.println(s3);
	}
}
}
