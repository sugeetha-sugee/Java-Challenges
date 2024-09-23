package org.Multi;

public class Child extends Parent {
    private void Cname() {
    	System.out.println("I am Child");
    }
    public static void main(String[] args) {
		Child a = new Child();
		a.Cname();
		a.Pname();
		a.GPname();
	}
}
