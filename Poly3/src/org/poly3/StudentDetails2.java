package org.poly3;
//child
public class StudentDetails2 extends StudentDetails {
	public void studName(String name) {
		System.out.println("student Name is: "+name);
		super.studName("Sugee");
	}
	public static void main(String[] args) {
		StudentDetails2 a = new StudentDetails2();
		a.studName("Chintu");
	}
}
