package com.meritamerica.assignment2;

public class SavingsAccount {
	
	private double balance;
	private final double INTERESTRATE = 0.01;
	
	public SavingsAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.INTERESTRATE;
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
		return  "Savings Account Balance: $" + getBalance() + "\n" +
				"Savings Account Interest Rate: " + INTERESTRATE + "%" + "\n" +
				"Savings Account Balance in 3 years: $" + String.format( "%.2f", futureValue(3));
	}

	
}