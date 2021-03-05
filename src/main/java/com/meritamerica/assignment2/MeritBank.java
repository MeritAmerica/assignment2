package com.meritamerica.assignment2;

import java.util.*;

/* Fix error with first and 2nd best CD val, add combined bals and next Acct num */

public class MeritBank 
{
	private static CDOffering[] listOfCDOffers =  new CDOffering[5];
	private static AccountHolder[] accountHolderList = new AccountHolder[10];
	
	static void addAccountHolder(AccountHolder accountHolder)
	{
		for(int i = 0; i < accountHolderList.length; i++)
		{
			if(accountHolderList[i] == null)
			{
				accountHolderList[i] = accountHolder;
				break;
			}
		}
	}
	
	static AccountHolder[] getAccountHolders()
	{
		return accountHolderList;
	}
	
	static CDOffering[] getCDOfferings()
	{
		return listOfCDOffers;
	}
	
	static CDOffering getBestCDOffering(double depositAmount)
	{		
		double stored = futureValue(depositAmount, listOfCDOffers[0].getInterestRate(), listOfCDOffers[0].getTerm());
		int indexBiggest = 0;
		for(int i = 1; i < listOfCDOffers.length; i++)
		{
			double tempStored = futureValue(depositAmount, listOfCDOffers[i].getInterestRate(), listOfCDOffers[i].getTerm());
			if(tempStored > stored)
			{
				stored = tempStored;
				indexBiggest = i;
			}				
		}		
		return listOfCDOffers[indexBiggest];
	}
	
	/* ERROR IN LINE 53 AND 34*/
	
	static CDOffering getSecondBestCDOffering(double depositAmount)
	{
		double biggest = futureValue(depositAmount, listOfCDOffers[0].getInterestRate(), listOfCDOffers[0].getTerm());
		double secondBiggest = futureValue(depositAmount, listOfCDOffers[0].getInterestRate(), listOfCDOffers[0].getTerm());
		int indexBiggest = 0;
		int indexSecondBiggest = 0;
		for(int i = 1; i < listOfCDOffers.length; i++)
		{
			double tempStored = futureValue(depositAmount, listOfCDOffers[i].getInterestRate(), listOfCDOffers[i].getTerm());								
			if(tempStored > biggest)
			{
				indexSecondBiggest = indexBiggest;
				indexBiggest = i;			
			}
			if(tempStored > secondBiggest && tempStored != biggest)
			{
				indexSecondBiggest = i;
			}
		}		
		return listOfCDOffers[indexSecondBiggest];
	}
	
	static void clearCDOfferings()
	{
		listOfCDOffers = null;
	}
	
	static void setCDOfferings(CDOffering[] offerings)
	{
		listOfCDOffers = offerings;
	}
	
	static long getNextAccountNumber()
	{
		
	}
	
	static double totalBalances()
	{
		double totalCheckingBal = 0;
		double totalSavingsBal = 0;
		double totalCDBal = 0;
		double total = totalCDBal + totalCheckingBal + totalSavingsBal;
		for(AccountHolder ah: accountHolderList) 
		{
			
		}
	 }
	
	static double futureValue(double presentValue, double interestRate, int term)
	{
		return presentValue * Math.pow((1 + interestRate), (double)term);
	}

}
