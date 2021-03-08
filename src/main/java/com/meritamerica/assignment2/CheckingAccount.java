package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {

	final double INTEREST_RATE = .0001;
	protected double currentBalance;
	
	

	public CheckingAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}

	public double CheckingAccount(double currentBalance) {
		return currentBalance += getBalance();
	}

	public double getBalance() {
		return currentBalance;
	}

	public double getInterestRate() {

		return INTEREST_RATE;
	}

	public boolean withdraw(double amount) {
		if (amount >= 0 && amount <= currentBalance) {
			currentBalance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean deposit(double amount) {
		if (amount >= 0) {
			currentBalance += amount;
			return true;
		} else {
			return false;
		}
	}

	public double futureValue(int years) {
		return currentBalance * Math.pow(1 + INTEREST_RATE * 100, years);
	}

	public String toString() {
		return "Checking Account Balance: $" + currentBalance + "\n" + "Checking Account Interest Rate: "
				+ INTEREST_RATE * 100 + "\n" + "Checking Account Balance in 3 years: $" + futureValue(3) + "\n";
	}

}
