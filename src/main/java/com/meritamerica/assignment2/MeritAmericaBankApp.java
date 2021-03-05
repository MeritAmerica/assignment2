package com.meritamerica.assignment2;

public class MeritAmericaBankApp 
{
	public static void main(String[] args) 
	{
		MeritBank meritBank = new MeritBank();
		
		System.out.println("Hello Merit America!");
		CDOffering[] cdOfferings = new CDOffering[5];												// add 5 CD Offerings
		cdOfferings[0] = new CDOffering(1, 1.8);
		cdOfferings[1] = new CDOffering(2, 1.9);
		cdOfferings[2] = new CDOffering(3, 2.0);
		cdOfferings[3] = new CDOffering(5, 2.5);
		cdOfferings[4] = new CDOffering(10, 2.2);
		MeritBank.setCDOfferings(cdOfferings);
		
		AccountHolder ah1 = new AccountHolder("The", "Super", "Dave", "111-11-1111");
		MeritBank.addAccountHolder(ah1);															// Instantiate 1 new account holder, AH1
		// add a checking account with opening bal of $1000, Savings with $10000
		// add a checking account with opening bal of $5000, savings with $50000
		// add a checking account with opening bal of $50000, savings with $500000
		// add a checking account with opening bal of $5000, savings with $50000
		// confirm 4th checking/savings was not created
		// add best CD offering as CD account on AH1
		// add AH1 to list of account holders
		
		// Instantiate AH2
		// add a checking account with opening bal of $1000, Savings with $10000
		// add 2nd best CD offering as CD account to AH2
		// add AH2 to list of account holders
		// clear CDs being offered by MA
		
		// Instantiate AH3
		// add 2nd best CD offering as CD account to AH3
		// confirm CD account was not created for AH3
		// add a checking account with opening bal of $1000, Savings with $10000 for ah3
		// add AH3 to list of account holders 
		// get total bal of all account holders
	}
}