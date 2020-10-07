package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder john = new AccountHolder
				("John",
				 "James", 
				 "Doe", 
				 "123-45-6789", 
				  100.0, 
				  1000.0);
		
		System.out.println(john);
		john.getCheckingAccount().deposit(500.0);
		john.getSavingsAccount().withdraw(800.0);
		john.getCheckingAccount().futureValue(3);
		john.getSavingsAccount().futureValue(3);
		System.out.println(john.getCheckingAccount());
		System.out.println(john.getSavingsAccount());
		
		AccountHolder maynard = new AccountHolder
				("Maynard", 
				"James", 
				"Keenan", 
				"845-65-1298", 
				200.0, 
				500.0);
		
		maynard.getCheckingAccount().deposit(-500.0);
		maynard.getSavingsAccount().withdraw(600);
		System.out.println(maynard);
	}
}