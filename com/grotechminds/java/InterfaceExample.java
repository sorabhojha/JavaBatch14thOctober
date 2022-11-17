package com.grotechminds.java;

public class InterfaceExample {

	public static void main(String[] args) {
		SbiBankingApp app = new SbiBankingApp();
		app.nameOfTheBank();
		app.withdraw(100);
	}
}

interface BankingAppInterface {
	Float interestRate = 8.2f;
	void nameOfTheBank();
	void withdraw(int amount);
}

class SbiBankingApp implements BankingAppInterface{

	@Override
	public void nameOfTheBank() {
		System.out.println("Welcome to the core banking app of SBI !!");
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount Withdrawn:"+amount);
	}
}