package com.meritamerica.assignment2;

import java.util.*;

/* Fix error with first and 2nd best CD val, add combined bals and next Acct num */

public class MeritBank 
{
	private static CDOffering[] listOfCDOffers =  new CDOffering[5];
	private static AccountHolder[] listOfAccountHolders = new AccountHolder[10];
	private static long nextAccountNumber = 0L;
	
	static void addAccountHolder(AccountHolder accountHolder)
	{
		for(int i = 0; i < listOfAccountHolders.length; i++)
		{
			if(listOfAccountHolders[i] == null)
			{
				listOfAccountHolders[i] = accountHolder;
				break;
			}
		}
	}
	
	static AccountHolder[] getAccountHolders()
	{
		return listOfAccountHolders;
	}
	
	static CDOffering[] getCDOfferings()
	{
		return listOfCDOffers;
	}
	
	static CDOffering getBestCDOffering(double depositAmount)
	{	
		if(listOfCDOffers == null) return null;
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
	
	static CDOffering getSecondBestCDOffering(double depositAmount)
	{
		if(listOfCDOffers == null) return null;
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
		return nextAccountNumber++;
	}
	
	static double totalBalances()
	{
		double total = 0;
		for(AccountHolder ah: listOfAccountHolders) 
		{
			if(ah != null)
			{
				total += ah.getCombinedBalance();
			}		
		}
		return total;
	 }
	
	public static double futureValue(double presentValue, double interestRate, int term)
	{
		return presentValue * Math.pow((1 + interestRate), term);
	}

}
