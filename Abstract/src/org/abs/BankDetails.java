package org.abs;
//Parent
//partial abstraction
public abstract class BankDetails {
	//non-abstract
    public void AccName(String name) {
		System.out.println("Account name is: "+name);

	}
    //non-abstract
    public void AccId(int id) {
		System.out.println("Account Id is: "+id);

	}
    //abstract
    public abstract void AtmPin(int pin);
}
