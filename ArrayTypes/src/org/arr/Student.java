package org.arr;

public class Student {
     public static void main(String[] args) {
		//for loop  -- index based(0 to n-1)
    	 int a[] = new int[5];
    	 a[0]=10;
    	 a[1]=20;
    	 a[2]=30;
    	 a[3]=40;
    	 a[4]=50;
//    	 System.out.println(a[0]);
    	 
    	 for(int i=0;i<=4;i++) {
    		 System.out.println(a[i]);
    	 }
    	 
    System.out.println("=====================================================");	
    //for each -- value based(1-n)
    for(int b:a) {
    	System.out.println(b);
    }
    System.out.println("=====================================================");	
    
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
	}
} 
