package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class AccountHolder 
{
	/*INSTANCE VARIABLES*/
	
	private static final double BALANCE_LIMIT = 250000;
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount[] checkingAccountList = new CheckingAccount[10];
	private SavingsAccount[] savingsAccountList = new SavingsAccount[10];
	private CDAccount[] cdAccountList = new CDAccount[10];
	
		
	/*METHODS*/
	AccountHolder() {}
	
	AccountHolder(
			String firstName,
			String middleName,
			String lastName,
			String ssn			
			)
	{
		this.firstName = firstName;		
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
		
	/*GETTERS*/
	String getFirstName()
	{
		return firstName;
	}
	
	String getMiddleName()
	{
		return middleName;
	}
	
	String getLastName()
	{
		return lastName;
	}
	
	String getSSN()
	{
		return ssn;
	}
	
	CheckingAccount addCheckingAccount(double openingBalance)
	{
		if((openingBalance + (getCombinedBalance() - getCDChecking()) < BALANCE_LIMIT)
		{
			return addCheckingAccount(new CheckingAccount(openingBalance));
		}
	}
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount)
	{
		if((checkingAccount.getBalance() + (getCombinedBalance() - getCDBalance()) < BALANCE_LIMIT)
		{
			for(int i = 0; i < checkingAccountList.length; i++)
			{
				if(checkingAccountList[i] == null)
				{
					checkingAccountList[i] = checkingAccount;
					break;
				}
			}
		}
		return checkingAccount;
	}
	
	CheckingAccount[] getCheckingAccounts() 
	{
		return checkingAccountList;
	}
	
	int getNumberOfCheckingAccounts()
	{
		int numOfAccounts = 0;
		for(CheckingAccount i: checkingAccountList)
		{
			if(i != null)
			{
				numOfAccounts++;
			}
		}
		return numOfAccounts;
	}
	
	double getCheckingBalance()
	{
		double sum = 0;
		for(int i = 0; i < checkingAccountList.length + 1; i++)
		{
			if(checkingAccountList[i] == null)
			{
				break;
			}
			sum += checkingAccountList[i].getBalance();
		}
		return sum;
	}
	
	SavingsAccount addSavingsAccount(double openingBalance)
	{
		if((openingBalance + (getCombinedBalance() - getCDChecking()) < BALANCE_LIMIT))
				{
					return addSavingsAccount(new SavingsAccount(openingBalance));
				}
	}	
	
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)
	{
		if((savingsAccount.getBalance() + (getCombinedBalance() - getCDBalance()) < BALANCE_LIMIT)
		{
			for(int i = 0; i < savingsAccountList.length; i++)
			{
				if(savingsAccountList[i] == null)
				{
					savingsAccountList[i] = savingsAccount;
					break;
				}
			}
		}
		return savingsAccount;
	}
	
	SavingsAccount[] getSavingsAccounts()
	{
		return savingsAccountList;
	}
	
	int getNumberOfSavingsAccounts()
	{
		int numOfAccounts = 0;
		for(SavingsAccount i: savingsAccountList)
		{
			if(i != null)
			{
				numOfAccounts++;
			}
		}
		return numOfAccounts;
	}
	
	double getSavingsBalance()
	{
		double sum = 0;
		for(int i = 0; i < savingsAccountList.length + 1; i++)
		{
			if(savingsAccountList[i] == null)
			{
				break;
			}
			sum += savingsAccountList[i].getBalance();
		}
		return sum;
	}
	
	CDAccount addCDAccount(CDOffering offering, double openingBalance)
	{
		return addCDAccount(new CDAccount(offering, openingBalance));
	}
	
	CDAccount addCDAccount(CDAccount cdAccount)
	{
		return cdAccount;
	}
	
	CDAccount[] getCDAccounts()
	{
		return cdAccountList;
	}
	
	int getNumberOfCDAccounts()
	{
		int numOfAccounts = 0;
		for(CDAccount i: cdAccountList)
		{
			if(i != null)
			{
				numOfAccounts++;
			}			
		}
		return numOfAccounts;
	}
	
	double getCDBalance()
	{
		double sum = 0;
		for(int i = 0; i < cdAccountList.length + 1; i++)
		{
			if(cdAccountList[i] == null)
			{
				break;
			}
			sum += cdAccountList[i].getBalance();
		}
		return sum;
	}
	
	double getCombinedBalance()
	{
		return getCheckingBalance() + getSavingsBalance() + getCDBalance();
	}

	/*SETTERS*/
	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	void setSSN(String ssn)
	{
		this.ssn = ssn;
	}
}