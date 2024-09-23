package org.poly1;

public class StudentDetails2 {
      private void studName(String name,int id) {
		System.out.println("Student name is :"+name+"\n"+
                           "Student id is:"+id);

	}
      private void studName(int id,String name) {
  		System.out.println("Student id is :"+id+"\n"+
                             "Student name is:"+name);

  	}
      public static void main(String[] args) {
    	  StudentDetails2 b = new StudentDetails2();
    	  b.studName(15, "chutki");
    	  b.studName("Shinzo", 10);
    	  
	}
}
