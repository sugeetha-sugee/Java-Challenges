package org.bank2;
//child2
import org.bank.RBI;
public class BI extends RBI {
   private void Ibamt() {
	System.out.println("IB amt is 20k");

}
   public static void main(String[] args) {
	 BI b = new BI();
	 b.Ibamt();
	 b.amtToIb();
}
}
