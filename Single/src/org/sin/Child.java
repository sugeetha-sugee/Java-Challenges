package org.sin;

public class Child extends Parent {
     private void Cname() {
    	 System.out.println("My name is Leo");
     }
     public static void main(String[] args) {
		Child a = new Child();
		a.Cname();
		a.Pname();
	}
}
