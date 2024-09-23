package org.bank1;
//child1
import org.bank.RBI;
public class SBI extends RBI {
    private void Sbiamt() {
		System.out.println("SBI amt is 10k");

	}
    public static void main(String[] args) {
		SBI a = new SBI();
		a.Sbiamt();
		a.amtToSbi();
	}
}
