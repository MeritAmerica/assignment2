package com.meritamerica.assignment2;

import java.util.Date;

public class BankAccount {

	private double balance;
	private double interestRate;
	private long accountNumber;
	Date openDate;

	public BankAccount(double balance, double interestRate) {
		 this(MeritBank.getNextAccountNumber(), balance, interestRate);
	}

	public BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	
	public double getBalance() {
		return this.balance;
	}


	public double getInterestRate() {
		return this.interestRate;
	}

	public boolean withdraw(double amount) {
		if ((amount <= balance) && (amount >= 0)) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean deposit(double amount) {
		if ((amount > 0)) {
			balance += amount;
			return true;
		} else {
			return false;
		}

	}

	public double futureValue(int years) {
		return (balance * (Math.pow((1 + interestRate), years)));
	}

}
