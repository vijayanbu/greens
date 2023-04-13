package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
	
		System.out.println("Savings");
	}
	private void fixed() {
		
		System.out.println("Fixed");

	}
	
	@Override
	public void deposit() {
		System.out.println("Deposit interest increased");
	}
	public static void main(String[] args) {
		
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
