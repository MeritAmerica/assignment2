package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{

	private double balance;
	
	private CDOffering offering = null;
	
	private Date startDate;
	
	public CDAccount(double balance, CDOffering offering) {
		super();
		this.balance = balance;
		this.offering = offering;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public CDOffering getOffering() {
		return offering;
	}

	public void setOffering(CDOffering offering) {
		this.offering = offering;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public double futureValue() {
		return(this.getBalance() * Math.pow(1, balance));
	}
	
}
