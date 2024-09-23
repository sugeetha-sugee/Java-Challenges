package org.abs2;
//Child
public class BankDetails2 implements BankDetails{
       public void AccName(String name) {
		System.out.println("Account name is: "+name);

	}
       public  void AccId(int id) {
    	   System.out.println("Account Id is: "+id);
       }
       public  void AccPin(int Pin) {
    	   System.out.println("Account id is: "+Pin);
       }
       public static void main(String[] args) {
    	   BankDetails2 b = new BankDetails2();
    	   b.AccName("Krish");
    	   b.AccId(9876543);
    	   b.AccPin(9875);
	}
}
