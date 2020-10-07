package com.meritamerica.assignment1;

public class AccountHolder {

	public CheckingAccount checkingAccount;
	public SavingsAccount savingsAccount;
	
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
			String ssn, 
			double checkingAccountOpeningBalance, 
			double savingsAccountOpeningBalance)
			{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
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
	
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
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