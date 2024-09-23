package org.emp;

public class Employee {
    private void empId() {
    	System.out.println("EmployeeId");
    }
    private void empName() {
    	System.out.println("EmployeeName");
    }
    private void empDob() {
    	System.out.println("EmployeeDob");
    }
    private void empPhone() {
    	System.out.println("EmployeePhone");
    }
    private void empEmail() {
    	System.out.println("EmployeeEmail");
    }
    private void empAddress() {
    	System.out.println("EmployeeAddres");
    }
    public static void main(String[] args) {
		Employee a = new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
	}
}
    
