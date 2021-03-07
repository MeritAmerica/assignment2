package com.meritamerica.assignment2;

public class SavingsAccount extends CheckingAccount {

	protected final double ANNUAL_INTEREST_RATE =  .01;
	public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}

	public String toString(){
		return "Savings Account Balance: $" + currentBalance + "\n" +
			"Savings Account Interest Rate: " + ANNUAL_INTEREST_RATE + "\n" +
			"Savings Account Balance in 3 years: $" + futureValue(3) + "\n";		
	}
}
