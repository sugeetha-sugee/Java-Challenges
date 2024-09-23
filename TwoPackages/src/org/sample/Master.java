package org.sample;

import org.base.Company;

public class Master {
    private void masterId() {
	   System.out.println("My master Id is: 098765");

	}
    private void masterName() {
	   System.out.println("Master name Is: jack");

	}
    public static void main(String[] args) {
		Master a= new Master();
		a.masterId();
		a.masterName();
		
		Company b = new Company();
		b.comId();
		b.comName(); 
	}
}
