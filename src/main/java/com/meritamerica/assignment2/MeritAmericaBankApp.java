package com.meritamerica.assignment2;


public class MeritAmericaBankApp {
	public static void main(String[] args) {
	
		AccountHolder myAccount = new AccountHolder("Yoni","","Werkneh", "6758244555", 100, 1000);
		
		
		System.out.println(myAccount.toString());

		
		myAccount.getCheckingAccount().deposit(500);

		
		myAccount.getSavingsAccount().withdraw(800);
		
		
		
		
		System.out.println(myAccount.getCheckingAccount().toString());
		System.out.println(myAccount.getSavingsAccount().toString());
	
	AccountHolder herAccount = new AccountHolder("Zufan","","Werkneh", "6758244800", 200, 500);
		herAccount.getCheckingAccount().deposit(-500);
		herAccount.getSavingsAccount().withdraw(600);
		
		System.out.println(herAccount.toString());
		System.out.println(herAccount.getCheckingAccount().toString());
		System.out.println(herAccount.getSavingsAccount().toString());
	}

		System.out.println("Hello Merit America!");
	
	
	}
