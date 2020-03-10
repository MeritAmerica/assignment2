package com.meritamerica.assignment2;

/**
 * This class has the main method which is the entry point of Merit America Bank
   and to call and use other classes and methods, its modifier is public 
 * @author ChrisJohnson
 * 
 */

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		// Adds five CDOfferings 
    	CDOffering[] CDOfferings = new CDOffering[5];
    		CDOfferings[0] = new CDOffering(1, .018);
    		CDOfferings[1] = new CDOffering(2, .019);
    		CDOfferings[2] = new CDOffering(3, .020);
    		CDOfferings[3] = new CDOffering(5, .025);
    		CDOfferings[4] = new CDOffering(10, .022);	
    	MeritBank.setCDOfferings(CDOfferings);
    	
    	// Calls the AccountHolder constructor and create a new AccountHolder object with ah1 reference parameter
    	AccountHolder ah1 = new AccountHolder("Nate", "Allen", "Berg", "123121234");
    	
    	ah1.addCheckingAccount(1000);
    	ah1.addSavingsAccount(10000);
    	ah1.addCheckingAccount(5000);
    	ah1.addSavingsAccount(50000);
    	ah1.addCheckingAccount(50000);
    	ah1.addSavingsAccount(500000);
    	ah1.addCheckingAccount(5000);
    	ah1.addSavingsAccount(50000);
    	
    	ah1.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);
    	System.out.println(ah1.getCDAccounts()[0].getTerm());
    	MeritBank.addAccountHolder(ah1); // Adds ah1 to MeritBank's list of account holders 
    	
      	// Calls the AccountHolder constructor and create a new AccountHolder object with ah2 reference parameter
    	AccountHolder ah2 = new AccountHolder("Christopher", "Patrick", "Johnson", "111223344");
    	
    	ah2.addCheckingAccount(1000);
    	ah2.addSavingsAccount(10000);
    	ah2.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
    	System.out.println(ah2.getCDAccounts()[0].getTerm());
    	MeritBank.addAccountHolder(ah2); // Adds ah2 to MeritBank's list of account holders 
    	
    	MeritBank.clearCDOfferings();
    	
      	// Calls the AccountHolder constructor and create a new AccountHolder object with ah3 reference parameter
    	AccountHolder ah3 = new AccountHolder("Shelby", "Lynn", "Johnson", "443322111");
    
    	ah3.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
    	System.out.println(ah3.getCDAccounts().length);
    	ah3.addCheckingAccount(1000);
    	ah3.addSavingsAccount(10000);
    	MeritBank.addAccountHolder(ah3); // Adds ah3 to MeritBank's list of account holders 
    	System.out.println("Total aggregate account Balance: $" + MeritBank.totalBalances());
    	
	}
	
}