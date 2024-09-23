package org.poly1;
//Method overloading
//same class
//same method
//different arguments
public class StudentDetails {
   private void studName(String name) {
	System.out.println("Student name is : "+name);
	this.studName(77);
   }
	private void studName(int id) {
		System.out.println("Student id is: "+id);
		

     
}
	 public static void main(String[] args) {
		StudentDetails a = new StudentDetails();
		a.studName("Sugeetha");
		
//		a.studName(4049);
		
//		a.studName("Krish");
//		
//		a.studName(21);
//		
//		a.studName("Chutki");
//		
//		a.studName(15);
	}
}
 