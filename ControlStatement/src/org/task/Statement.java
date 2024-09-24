package org.task;

public class Statement {
      private void voter(int age) {
		if(age>=18) {
			System.out.println("Eligibility to vote");
		}
		else {
			System.out.println("Not eligibility to vote");
		}
	  
	}
     
      
      //task1
      private void OddorEven(int num) {
		if(num%2==0) {
			System.out.println("It is Even Number");
		}
		else {
			System.out.println("It is Odd Number");
		}

	}
     
      public static void main(String[] args) {
  		Statement a = new Statement();
  		a.voter(20);
  		a.OddorEven(7);
  		a.OddorEven(8);
  	}
      
      
}
