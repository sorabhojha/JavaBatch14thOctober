package com.grotechminds.java;

public class InterfaceExample {

	public static void main(String[] args) {
		BankingAppInterface app = new SbiBankingApp();
		app.nameOfTheBank();
		app.withdraw(100);
	}
}

interface BankingAppInterface {
	public static final Float interestRate = 8.2f;
	// 
	void nameOfTheBank(); //abstract and public by default
	void withdraw(int amount);
}

class SbiBankingApp implements BankingAppInterface{

	@Override
	public void nameOfTheBank() {
		System.out.println("Welcome to the core banking app of SBI !!"+BankingAppInterface.interestRate);
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount Withdrawn:"+amount);
	}
}