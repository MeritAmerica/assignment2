package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	public static int size = 5, numberOfAccountHolders;
	public static long[] accountNumbers = new long[size];
	public static AccountHolder[] accountHolders = new AccountHolder[size];
	public static CDOffering[] CDOfferings = new CDOffering[size];
	MeritBank(){
		
	}
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		if(numberOfAccountHolders == size) {
			size *= 2;
			AccountHolder[] temp = new AccountHolder[size];
			for(int i = 0; i < numberOfAccountHolders; i++) {
				temp[i] = accountHolders[i];
			}
			accountHolders = temp;
			accountHolder = new AccountHolder();
			accountHolders[numberOfAccountHolders] = accountHolder;
			numberOfAccountHolders++;
		}else {
			accountHolder = new AccountHolder();
			accountHolders[numberOfAccountHolders] = accountHolder;
			numberOfAccountHolders++;
		}
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}
	
	public static CDOffering[] getCDOfferings() {
		return CDOfferings;
	}
	
	public static CDOffering getBestCDOffering(double depositAmount) {
		CDAccount temp = new CDAccount(CDOfferings[0], depositAmount);
		CDOffering best = CDOfferings[0];
		for(int i = 1; i < size; i++) {
			if(temp.futureValue(CDOfferings[i].getTerm()) > temp.futureValue(CDOfferings[i - 1].getTerm())) {
				best = CDOfferings[i];
			}
		}
		return best;
	}
	
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		CDAccount temp = new CDAccount(CDOfferings[0], depositAmount);
		CDOffering secondBest = CDOfferings[0];
		CDOffering best = CDOfferings[0];
		for(int i = 1; i < size; i++) {
			if(temp.futureValue(CDOfferings[i].getTerm()) > temp.futureValue(CDOfferings[i - 1].getTerm())) {
				secondBest = best;
				best = CDOfferings[i];	
			}
		}
		return secondBest;
	}
	
	public static void clearCDOfferings() {
		CDOfferings = null;
	}
	
	public static void setCDOfferings(CDOffering[] offerings) { 
		CDOfferings = offerings;
	}
	
	public static long getNextAccountNumber() {
		return accountNumbers[numberOfAccountHolders];
	}
	
	public static double totalBalances() {
		double total;
		total = 
	}
	
	public String toString() {
		return "AccountHolders: " + accountHolders + 
				"CDOfferings: " + CDOfferings;
	}
	
}
