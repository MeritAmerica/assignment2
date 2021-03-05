package com.meritamerica.assignment2;

public class BankAccount 
{
	/* Create way to get acct number */
	
	/* INSTANCE VARIABLES */
	protected long accountNumber;
	protected double balance;
	protected double interestRate;
	
	BankAccount(){}
	
	BankAccount(double balance, double interestRate)
	{
		new BankAccount();
	}
	
	BankAccount(long accountNumber, double balance, double interestRate)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	long getAccountNumber()
	{
		// create random num gen 8 digits long and assign?
		return this.accountNumber;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	double getInterestRate()
	{
		return interestRate / 100;
	}
	
	boolean withdraw(double amount)
	{
		if(amount >= balance)
		{
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	boolean deposit (double amount)
	{
		if(amount < 0)
		{
			this.balance += amount;
			return true;
		}
		return false;
	}
	
	double futureValue(int years)
	{
		return balance * Math.pow((1 + interestRate), (double)years);
	}

}
