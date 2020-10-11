package com.meritamerica.assignment2;

public class AccountHolder {
	public int numberOfCheckingAccounts = 0, numberOfSavingsAccounts = 0, numberOfCDAccounts = 0, size = 5;
	public double totalAccountBalance = 0;
	public CheckingAccount checkingAccount;
	public SavingsAccount savingsAccount;
	public CDAccount cdAccount;
	public CheckingAccount[] checkingAccounts = new CheckingAccount[size];
	public SavingsAccount[] savingsAccounts = new SavingsAccount[size];
	public CDAccount[] cdAccounts = new CDAccount[size];
	
/** Bank Account Information */
	public String firstName, middleName, lastName, ssn;
	public double checkingAccountOpeningBalance, savingsAccountOpeningBalance;
	
/** Default Constructor */	
	AccountHolder(){
	}
	
/** Custom Constructor */	
	AccountHolder
			(String firstName, 
			String middleName, 
			String lastName,
			String ssn)
			{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
/** Getters and Setters */	
	public double getTotalAccountBalance() {
		for(int i = 0; i < numberOfCheckingAccounts || i < numberOfSavingsAccounts; i++) {
			if(i < numberOfCheckingAccounts) {
				totalAccountBalance += checkingAccounts[i].getBalance();
			}
			if(i < numberOfSavingsAccounts) {
				totalAccountBalance += savingsAccounts[i].getBalance();
			}
		}
		return totalAccountBalance;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return this.ssn;
	}
	
	public void setSSN(String SSN) {
		this.ssn = SSN;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		if(totalAccountBalance >= 250000.0) {
			System.out.print("Cannot hold more than $250,000 per account holder!!");
			return null;
		}
		if(numberOfCheckingAccounts == size) {
			size *= 2;
			CheckingAccount[] temp = new CheckingAccount[size];
			for(int i = 0; i < numberOfCheckingAccounts; i++) {
				temp[i] = checkingAccounts[i];
			}
			CheckingAccount account = new CheckingAccount(openingBalance);
			temp[numberOfCheckingAccounts] = account;
			checkingAccounts = temp;
			numberOfCheckingAccounts++;
			return account;
		}else {
			CheckingAccount account = new CheckingAccount(openingBalance);
			checkingAccounts[numberOfCheckingAccounts] = account;
			numberOfCheckingAccounts++;
			return account;
		}
	}
	

	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if(totalAccountBalance >= 250000.0) {
			System.out.print("Cannot hold more than $250,000 per account holder!!");
			return checkingAccount;
		}
		if(numberOfCheckingAccounts == size) {
			size *= 2;
			CheckingAccount[] temp = new CheckingAccount[size];
			for(int i = 0; i < numberOfCheckingAccounts; i++) {
				temp[i] = checkingAccounts[i];
			}
			
			temp[numberOfCheckingAccounts] = checkingAccount;
			checkingAccounts = temp;
			numberOfCheckingAccounts++;
			return checkingAccount;
		}else {
			checkingAccounts[numberOfCheckingAccounts] = checkingAccount;
			numberOfCheckingAccounts++;
			return checkingAccount;
		}
	}
	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts;
	}
	
	public int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccounts;
	}
	
	public double getCheckingBalance() {
		return checkingAccount.getBalance();
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		if(totalAccountBalance >= 250000.0) {
			System.out.print("Cannot hold more than $250,000 per account holder!!");
			return null;
		}
		if(numberOfSavingsAccounts == size) {
			size *= 2;
			SavingsAccount[] temp = new SavingsAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = savingsAccounts[i];
			}
			SavingsAccount account = new SavingsAccount(openingBalance);
			temp[numberOfSavingsAccounts] = account;
			savingsAccounts = temp;
			numberOfSavingsAccounts++;
			return account;
		}else {
			SavingsAccount account = new SavingsAccount(openingBalance);
			savingsAccounts[numberOfCheckingAccounts] = account;
			numberOfSavingsAccounts++;
			return account;
		}
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if(totalAccountBalance >= 250000.0) {
			System.out.print("Cannot hold more than $250,000 per account holder!!");
			return null;
		}
		if(numberOfSavingsAccounts == size) {
			size *= 2;
			SavingsAccount[] temp = new SavingsAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = savingsAccounts[i];
			}
			temp[numberOfSavingsAccounts] = savingsAccount;
			savingsAccounts = temp;
			numberOfSavingsAccounts++;
			return savingsAccount;
		}else {
			savingsAccounts[numberOfCheckingAccounts] = savingsAccount;
			numberOfSavingsAccounts++;
			return savingsAccount;
		}
	}
	
	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccounts;
	}
	
	public int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccounts;
	}
	
	public double getSavingsBalance() {
		return savingsAccount.getBalance();
	}
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		if(numberOfCDAccounts == size) {
			size *= 2;
			CDAccount[] temp = new CDAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = cdAccounts[i];
			}
			CDAccount account = new CDAccount(offering, openingBalance);
			temp[numberOfCDAccounts] = account;
			cdAccounts = temp;
			numberOfCDAccounts++;
			return account;
		}else {
			CDAccount account = new CDAccount(offering, openingBalance);
			cdAccounts[numberOfCDAccounts] = account;
			numberOfCDAccounts++;
			return account;
		}
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		if(numberOfCDAccounts == size) {
			size *= 2;
			CDAccount[] temp = new CDAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = cdAccounts[i];
			}
			temp[numberOfCDAccounts] = cdAccount;
			cdAccounts = temp;
			return cdAccount;
		}else {
			cdAccounts[numberOfCDAccounts] = cdAccount;
			numberOfCDAccounts++;
			return cdAccount;
		}
	}
	
	public CDAccount[] getCDAccounts() {
		return cdAccounts;
	}
	
	public int getNumberOfCDAccounts() {
		return numberOfCDAccounts;
	}
	
	public double getCDBalance() {
		return cdAccounts
	}
	
/** Converts type to String */	
	@Override
	public String toString() {
		return "Name: " + firstName + " " +  middleName + " " +  lastName + "\r\n" + 
				"SSN: " + ssn + "\r\n" +  
				"Checking Account Balance: " + checkingAccountOpeningBalance + "\r\n" +
				"Savings Account Balance " + savingsAccountOpeningBalance  + "\r\n";
	}
	
		
}