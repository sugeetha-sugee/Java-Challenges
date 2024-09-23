package org.poly2;
//This and Super

public class StudentDetails extends StudentDetails2{
     private void studName(String name) {
    	 System.out.println("Student name is: "+name);
    	 this.studName(45);
    	 super.studMail("sugee@123");
		
	}
     private void studName(int id) {
    	 System.out.println("Student id is: "+id);
    
		
	}
     public static void main(String[] args) {
    	 StudentDetails a = new StudentDetails();
    	 a.studName("Chutki");
	}
}
