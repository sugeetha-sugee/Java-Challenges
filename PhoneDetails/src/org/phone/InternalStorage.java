package org.phone;
//child
public class InternalStorage {
    private void processorName() {
		System.out.println("Processor name");

	}
    private void ramSize() {
		System.out.println("Ram Size");

	}
    public static void main(String[] args) {
		InternalStorage a = new InternalStorage();
		a.processorName();
		a.ramSize();
		
		ExternalStorage b = new ExternalStorage();
		b.size();
	}
}
 