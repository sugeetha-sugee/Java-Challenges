package org.sum;

public class Student {
      public static void main(String[] args) {
		int a =2;
		if(a%2==0) {
			System.out.println("It is Even");
		} else {
			System.out.println("It is Odd");
		}
		
		System.out.println("====================================");
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println("Even: "+i);
			} else {
				System.out.println("Odd: "+i);
			}
		}
	}
}
