package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount{
	private double balance;
	private double interestRate;
	private int term;
	private int startDate; 
	private long accountNumber;

	
	public CDAccount(CDOffering offering, double openingBalance) {
		this.CDOffering = offering;
		this.openingBalance = openingBalance;
		
	}
	
	public double getBalance() {
	return this.balance;	
	}
	
	public double getInterestRate() {
	return this.interestRate;
	}
	
	public int getTerm() {
    return this.term;
	}
	
	public int getStartDate() {
		return this.startDate;
	}
	
	public long getAccountNumber() {
	return this.accountNumber;
	}
	
	public double futureValue(int term) {
		double futureValue;
		if (term <= 0) {
			System.out.println("Invalid period of time");
			return -1;
		} else {
			futureValue = balance * Math.pow((1+interestRate), term);
			return futureValue;
		}
	}
	
}

	

