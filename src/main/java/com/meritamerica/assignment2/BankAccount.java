package com.meritamerica.assignment2;

public class BankAccount {

	private double balance;
	
	private double intrestRate;
	
	private long accountNumber;

	public BankAccount(double balance, double intrestRate) {
		this.balance = balance;
		this.intrestRate = intrestRate;
	}

	public BankAccount(double balance, double intrestRate, long accountNumber) {
		this.balance = balance;
		this.intrestRate = intrestRate;
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public boolean withdraw(double amount) {
		if((amount <= balance) && (amount >=0)){
			balance -= 0;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return true;
		} else {
			return false;
		}
	}
	
	public double futureValue(int years) {
		return balance * Math.pow(1 + intrestRate*100, years);
	}
}
