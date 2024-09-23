package org.phone;

public class PhoneInfo {
   private void Phonename() {
	   System.out.println("OppoA12");
   }
   private void PhoneMieiNum() {
	   System.out.println("AU6578798");
   }
   private void Camera() {
	   System.out.println("Camera");
   }
   private void Storage() {
	   System.out.println("64gb");
   }
   private void osName() {
	   System.out.println("Andriod");
   }
   public static void main(String[] args) {
	PhoneInfo c = new PhoneInfo();
	c.Phonename();
	c.PhoneMieiNum();
	c.Camera();
	c.Storage();
	c.osName();
}
}
