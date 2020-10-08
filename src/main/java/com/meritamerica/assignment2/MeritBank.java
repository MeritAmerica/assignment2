package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	int size = 5;
	AccountHolder[] accountHolders = new AccountHolder[size];
	CDOffering[] CDOfferings = new CDOffering[size];
//	MeritBank(){
//	}
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		accountHolder = new AccountHolder();
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}
	
	public static CDOffering[] getCDOfferings() {
		
	}
	
	
}
