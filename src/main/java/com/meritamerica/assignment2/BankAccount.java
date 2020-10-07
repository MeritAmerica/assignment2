package com.meritamerica.assignment2;

public class BankAccount {
	public long accountNumber;
	public double balance, interestRate, futureBalance;
	
	BankAccount(){
	}
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public boolean withdraw(double amount) {
		if(amount < balance && amount > 0) {
			balance -= amount;
			return true;
		}else {
			System.out.println("Not enough money!!!");
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return true;
		}else {
			System.out.println("Cannot deposit a negative amount");
			return false;
		}
	}
	
	public double futureValue(int years) {
		futureBalance = (balance * Math.pow(1.0 + interestRate, years));
		return futureBalance;
	}
}
