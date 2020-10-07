package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	public CDOffering offering = new CDOffering();
	public double balance;
	
	CDAccount(CDOffering offering, double balance){
		this.offering = offering;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
