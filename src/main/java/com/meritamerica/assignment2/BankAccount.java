package com.meritamerica.assignment2;

public class BankAccount 
{
	/* Create way to get acct number */
	
	/* INSTANCE VARIABLES */
	protected long accountNumber;
	protected double balance;
	protected double interestRate;
	
	BankAccount(double balance, double interestRate)
	{
		this(MeritBank.getNextAccountNumber(), balance, interestRate);
	}
	
	BankAccount(long accountNumber, double balance, double interestRate)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	long getAccountNumber()
	{
		return this.accountNumber;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	double getInterestRate()
	{
		return interestRate;
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
