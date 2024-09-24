package org.task;

import java.util.ArrayList;
import java.util.List;

public class Company {
     public static void main(String[] args) {
		List li=new ArrayList();
		li.add(23);
		li.add("ss");
		li.add(true);
		li.add(16.25);
		li.add('s');
		li.add(23);
		li.add(null);
	
		System.out.println(li);
		
		for(int i=0;i<=6;i++) {
			Object object=li.get(i);
			System.out.println(object);
		}
		
	}
}
