package com.meritamerica.assignment2;

import java.util.Date;

/* Add get start date -- what is this for?? */

public class CDAccount extends BankAccount
{
	CDOffering offering;
	private double balance;
	
	CDAccount(CDOffering offering, double balance)
	{
		super();
		this.offering = offering;
		this.balance = balance;
	}
	
	double getBalance()
	{
		return this.balance;
	}
	
	double getInterestRate()
	{
		return this.offering.getInterestRate();
	}
	
	int getTerm()
	{
		return this.offering.getTerm();
	}
	
	java.util.Date getStartDate()
	{
		// Date date = new Date();
		// Calendar calendar = new GregorianCalendar();
		// calendar.setTime(date);
		/* OR */
		// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Date date = format.parse(datetime);
		// SimpleDateFormat df = new SimpleDateFormat("yyyy");
		// year = df.format(date);
		return null;
	}
	
	long getAccountNumber()
	{
		return super.accountNumber;
	}
	
	double futureValue()
	{
		return getBalance() * Math.pow((1 + getInterestRate()), getTerm());
	}

}
