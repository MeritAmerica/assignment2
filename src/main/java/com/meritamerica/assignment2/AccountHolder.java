package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String SSN;
	CheckingAccount checking;
	SavingsAccount savings;
	
	public AccountHolder() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.SSN = "";
		this.checking = new CheckingAccount(0.0);
		this.savings = new SavingsAccount(0.0);
	}

	
	public AccountHolder(String firstName, String middleName, String lastName, String SSN, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		checking = new CheckingAccount(checkingAccountOpeningBalance);
		savings = new SavingsAccount(savingsAccountOpeningBalance);
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
		return this.SSN;
	}
	
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public CheckingAccount getCheckingAccount() {
		return checking;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savings;
	}
	

	@Override
	public String toString() {
		return "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() 
		+ "\n" + "SSN: " + getSSN() + "\n" +
		getCheckingAccount().toString() + "\n" +
		getSavingsAccount().toString(); 
	}


	
}