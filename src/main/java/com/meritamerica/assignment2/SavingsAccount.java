package com.meritamerica.assignment2;

public class SavingsAccount {
	public double openingBalance, interestRate, futureBalance;
	
	SavingsAccount(
			double openingBalance)
			{
				this.openingBalance = openingBalance;
				this.interestRate = 0.01;
			}
	public double getBalance() {
		return this.openingBalance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public boolean withdraw(double amount) {
		if(amount < openingBalance && amount > 0) {
			openingBalance -= amount;
			return true;
		}else {
			System.out.println("Not enough money!!!");
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			openingBalance += amount;
			return true;
		}else {
			System.out.println("Cannot deposit a negative amount");
			return false;
		}
	}
	
	public double futureValue(int years) {
		futureBalance = (openingBalance * Math.pow(1.0 + interestRate, years));
		return futureBalance;
	}
	
	@Override
	public String toString() {
		return "Savings Account Balance: " + openingBalance + "\r\n" +
				"Savings Account Interest Rate: " + interestRate + "\r\n" +
				"Savings Account Balance in 3 years " + futureBalance;
	}
}