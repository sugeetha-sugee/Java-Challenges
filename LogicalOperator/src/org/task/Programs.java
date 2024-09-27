package org.task;

public class Programs {
	public static void main(String[] args) {
		//Reverse a String
		String s= "sugeetha";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		
		
		//Palindrome
		String a="malayalam";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
//			System.out.println(b);
		}
		System.out.println(b);
		
		if(a.equals(b)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}  
		
		
		
		//Sum of array

		int c[]={10,20,30,40};
		int sum=0;
		for(int i=0;i<c.length;i++) {
			sum=sum+c[i];
			
		}
		System.out.println(sum/c.length);
		
		
	}
}