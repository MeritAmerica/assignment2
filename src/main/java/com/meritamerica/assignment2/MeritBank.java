package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	public static int size = 5;
	public static AccountHolder[] accountHolders = new AccountHolder[size];
	public static CDOffering[] CDOfferings = new CDOffering[size];
//	MeritBank(){
//	}
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		accountHolder = new AccountHolder();
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}
	
	public static CDOffering[] getCDOfferings() {
		return CDOfferings;
	}
	
	public static void setCDOfferings(CDOffering[] offerings) { 
		CDOfferings = offerings;
	}
	
	public String toString() {
		return "AccountHolders: " + accountHolders + 
				"CDOfferings: " + CDOfferings;
	}
	
}
