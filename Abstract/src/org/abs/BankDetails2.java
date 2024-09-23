package org.abs;
//Child
public class BankDetails2 extends  BankDetails  {
     @Override
    public void AtmPin(int pin) {
    	System.out.println("ATM Pin is: "+pin);
    	
    }
     public static void main(String[] args) {
    	 BankDetails2 a =new  BankDetails2();
    	 a.AccName("Sugee");
    	 a.AccId(456709876);
    	 a.AtmPin(987658765);
	}
}
