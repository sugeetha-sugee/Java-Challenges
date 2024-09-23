package org.base;
//child class
public class Company {
   private void comId() {
	 System.out.println("com Id is: 099876");

}
   private void comName() {
	System.out.println("Deloitte");

}
   public static void main(String[] args) {
	 Company a = new Company();
	 a.comId();
	 a.comName();
	 
	 Employee b = new Employee();
	 b.empId();
	 b.empName();
	 
}
}
