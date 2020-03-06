package com.meritamerica.assignment2;

public class CheckingAccount {
	
	private double balance;
	private final double INTERESTRATE = 0.0001;
	
	public CheckingAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return INTERESTRATE;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= balance && amount>0) {
			this.balance -= amount;
			System.out.println("You withdrew: $" + amount);
			System.out.println("Your remaining balance is: $" + balance);
			return true;
		}
		System.out.println("Insufficient Funds.");
		return false;
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return true;
		}
		System.out.println(amount + " - Invalid amount.");
		return false;
	}
	
	public double futureValue(int years) {
		double futureValue;
		if (years <= 0) {
			System.out.println("Invalid period of time");
			return -1;
		} else {
			futureValue = balance * Math.pow((1 + INTERESTRATE), years);
			return futureValue;
		}
	}


	
	@Override
	public String toString() {
		return  "Checking Account Balance: $" + getBalance() + "\n" +
				"Checking Account Interest Rate: " + String.format( "%.4f", INTERESTRATE)+ "%" + "\n" +
				"Checking Account Balance in 3 years: $" + String.format( "%.2f", futureValue(3));
	}
	
	
	

}