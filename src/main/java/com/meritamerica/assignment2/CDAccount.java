package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount
{
	CDOffering offering;
	java.util.Date startDate;

	CDAccount(CDOffering offering, double balance)
	{
		super(balance, offering.getInterestRate());
		this.offering = offering;
		startDate = new java.util.Date();
	}
	
	int getTerm()
	{
		return this.offering.getTerm();
	}
	
	java.util.Date getStartDate()
	{
		return startDate;
	}
	
}
