package com.meritamerica.assignment2;

public class AccountHolder {
	public int numberOfCheckingAccounts = 0, numberOfSavingsAccounts = 0, numberOfCDAccounts = 0, size = 5;
	public double totalAccountBalance = 0;
//	public CheckingAccount checkingAccount;
//	public SavingsAccount savingsAccount;
//	public CDOffering cdOffering;
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
		if(totalAccountBalance + openingBalance > 250000.0) {
			System.out.println("Cannot hold more than $250,000 per account holder!!");
			return checkingAccounts[numberOfCheckingAccounts];
		}else if(numberOfCheckingAccounts == size) {
			size *= 2;
			CheckingAccount[] temp = new CheckingAccount[size];
			for(int i = 0; i < numberOfCheckingAccounts; i++) {
				temp[i] = checkingAccounts[i];
			}
			CheckingAccount account = new CheckingAccount(openingBalance);
			temp[numberOfCheckingAccounts] = account;
			checkingAccounts = temp;
			numberOfCheckingAccounts++;
			totalAccountBalance += openingBalance;
			return account;
		}else {
			CheckingAccount account = new CheckingAccount(openingBalance);
			checkingAccounts[numberOfCheckingAccounts] = account;
			numberOfCheckingAccounts++;
			totalAccountBalance += openingBalance;
			return account;
		}
	}
	

	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if(totalAccountBalance + checkingAccount.getBalance() > 250000.0) {
			System.out.println("Cannot hold more than $250,000 per account holder!!");
			return checkingAccount;
		}else if(numberOfCheckingAccounts == size) {
			size *= 2;
			CheckingAccount[] temp = new CheckingAccount[size];
			for(int i = 0; i < numberOfCheckingAccounts; i++) {
				temp[i] = checkingAccounts[i];
			}
			
			temp[numberOfCheckingAccounts] = checkingAccount;
			checkingAccounts = temp;
			numberOfCheckingAccounts++;
			totalAccountBalance += checkingAccount.getBalance();
			return checkingAccount;
		}else {
			checkingAccounts[numberOfCheckingAccounts] = checkingAccount;
			numberOfCheckingAccounts++;
			totalAccountBalance += checkingAccount.getBalance();
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
		double total = 0.0;
		for(int i = 0; i < numberOfCheckingAccounts; i++) {
			total += checkingAccounts[i].getBalance();
		}
		return total;
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		if(totalAccountBalance + openingBalance > 250000.0) {
			System.out.println("Cannot hold more than $250,000 per account holder!!");
			return savingsAccounts[numberOfSavingsAccounts];
		}else if(numberOfSavingsAccounts == size) {
			size *= 2;
			SavingsAccount[] temp = new SavingsAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = savingsAccounts[i];
			}
			SavingsAccount account = new SavingsAccount(openingBalance);
			temp[numberOfSavingsAccounts] = account;
			savingsAccounts = temp;
			numberOfSavingsAccounts++;
			totalAccountBalance += openingBalance;
			return account;
		}else {
			SavingsAccount account = new SavingsAccount(openingBalance);
			savingsAccounts[numberOfSavingsAccounts] = account;
			numberOfSavingsAccounts++;
			totalAccountBalance += openingBalance;
			return account;
		}
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if(totalAccountBalance + savingsAccount.getBalance() > 250000.0) {
			System.out.println("Cannot hold more than $250,000 per account holder!!");
			return savingsAccount;
		}else if(numberOfSavingsAccounts == size) {
			size *= 2;
			SavingsAccount[] temp = new SavingsAccount[size];
			for(int i = 0; i < numberOfSavingsAccounts; i++) {
				temp[i] = savingsAccounts[i];
			}
			savingsAccounts = temp;
			savingsAccounts[numberOfSavingsAccounts] = savingsAccount;
			numberOfSavingsAccounts++;
			totalAccountBalance += savingsAccount.getBalance();
			return savingsAccount;
		}else {
			savingsAccounts[numberOfSavingsAccounts] = savingsAccount;
			numberOfSavingsAccounts++;
			totalAccountBalance += savingsAccount.getBalance();
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
		double total = 0.0;
		for(int i = 0; i < numberOfSavingsAccounts; i++) {
			total += savingsAccounts[i].getBalance();
		}
		return total;
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
		double total = 0.0;
		for(int i = 0; i < numberOfCDAccounts; i++) {
			total += cdAccounts[i].getBalance();
		}
		return total;
	}
	
	public double getCombinedBalance() {
		double total = getCheckingBalance() + getSavingsBalance() + getCDBalance();
		return total;
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