package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		AccountHolder chris = new AccountHolder("Chris", "Patrick", "Johnson", "123456789", 100, 1000);
		
		System.out.println(chris.toString());
		System.out.println(" ");
		chris.getCheckingAccount().deposit(500);
		chris.getSavingsAccount().withdraw(800);
		System.out.println(" ");
		System.out.println(chris.getCheckingAccount().toString());
		System.out.println(" ");
		System.out.println(chris.getSavingsAccount().toString());
		System.out.println(" ");
		
		AccountHolder john = new AccountHolder("John", "James", "Doe", "987654321", 200, 500);
		System.out.println(" ");
		john.getCheckingAccount().deposit(-500);
		john.getSavingsAccount().deposit(600);
		System.out.println(" ");
		System.out.println(john.toString());
		
	}
	
	
}