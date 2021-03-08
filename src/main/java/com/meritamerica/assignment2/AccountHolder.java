package com.meritamerica.assignment2;

public class AccountHolder {

	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountBalance;
	private double savingsAccountBalance;
	private double cdAccountBalance;
	private int numberOfCDAccount;
	private int numberOfSavingsAccount;
	private int numberOfCheckingAccount;
	private SavingsAccount[] savingsAccount = new SavingsAccount[0];
	private CheckingAccount[] checkingAccount = new CheckingAccount[0];
	private CDAccount[] cdAccount = new CDAccount[0];



	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.numberOfSavingsAccount = 0;
		this.numberOfCheckingAccount = 0;
		this.numberOfCDAccount = 0;
		this.cdAccountBalance = 0;
		this.checkingAccountBalance = 0;
		this.savingsAccountBalance = 0;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public String getSSN() {
		return ssn;
	}

	public CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount checking = new CheckingAccount(openingBalance);
		CheckingAccount[] tempArray = new CheckingAccount[checkingAccount.length + 1];
		for (int i = 0; i < this.checkingAccount.length; i++) {
			tempArray[i] = this.checkingAccount[i];
		}
		if (getCheckingBalance() + getSavingsBalance() + openingBalance < 250000.00) {
			tempArray[numberOfCheckingAccount] = checking;
			numberOfCheckingAccount++;
		} else if (numberOfSavingsAccount > numberOfCheckingAccount) {
			tempArray[numberOfCheckingAccount] = checking;
			numberOfCheckingAccount++;
		} else {
			return checking;
		}
		checkingAccount = tempArray;
		return checking;
	}

	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		CheckingAccount[] tempArray = new CheckingAccount[this.checkingAccount.length + 1];
		for (int i = 0; i < this.checkingAccount.length; i++) {
			tempArray[i] = this.checkingAccount[i];
		}
		if (getCheckingBalance() + getSavingsBalance() + checkingAccount.getBalance() < 250000.00) {
			tempArray[numberOfCheckingAccount] = checkingAccount;
			numberOfCheckingAccount++;
		} else if (numberOfSavingsAccount > numberOfCheckingAccount) {
			tempArray[numberOfCheckingAccount] = checkingAccount;
			numberOfCheckingAccount++;
		} else {
			return checkingAccount;
		}
		this.checkingAccount = tempArray;
		return checkingAccount;
	}

	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccount;
	}

	public int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccount;
	}

	public double getCheckingBalance() {
		checkingAccountBalance = 0;
		for (CheckingAccount x : checkingAccount) {
			checkingAccountBalance += x.getBalance();
		}
		return checkingAccountBalance;
	}

	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount savings = new SavingsAccount(openingBalance);
		SavingsAccount[] tempArray = new SavingsAccount[savingsAccount.length + 1];
		for (int i = 0; i < this.savingsAccount.length; i++) {
			tempArray[i] = this.savingsAccount[i];
		}
		if (getCheckingBalance() + getSavingsBalance() + openingBalance < 250000) {
			tempArray[numberOfSavingsAccount] = savings;
			numberOfSavingsAccount++;
		} else if (numberOfCheckingAccount > numberOfSavingsAccount) {
			tempArray[numberOfSavingsAccount] = savings;
			numberOfSavingsAccount++;
		} else {
			return savings;
		}
		savingsAccount = tempArray;
		return savings;
	}

	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		SavingsAccount[] tempArray = new SavingsAccount[this.savingsAccount.length + 1];
		for (int i = 0; i < this.savingsAccount.length; i++) {
			tempArray[i] = this.savingsAccount[i];
		}
		if (getCheckingBalance() + getSavingsBalance() + savingsAccount.getBalance() < 250000) {
			tempArray[numberOfSavingsAccount] = savingsAccount;
			numberOfSavingsAccount++;
		} else if (numberOfCheckingAccount > numberOfSavingsAccount) {
			tempArray[numberOfSavingsAccount] = savingsAccount;
			numberOfSavingsAccount++;
		} else {
			return savingsAccount;
		}
		this.savingsAccount = tempArray;
		return savingsAccount;
	}

	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccount;
	}

	public int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccount;
	}

	public double getSavingsBalance() {
		savingsAccountBalance = 0;
		for (SavingsAccount y : savingsAccount) {
			savingsAccountBalance += y.getBalance();
		}
		return savingsAccountBalance;
	}

	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cd = new CDAccount(offering, openingBalance);
		CDAccount[] tempArray = new CDAccount[this.cdAccount.length + 1];
		for (int i = 0; i < this.cdAccount.length; i++) {
			tempArray[i] = this.cdAccount[i];
		}
		tempArray[numberOfCDAccount] = cd;
		numberOfCDAccount++;
		cdAccount = tempArray;
		return cd;
	}

	public CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount[] tempArray = new CDAccount[this.cdAccount.length + 1];
		for (int i = 0; i < this.cdAccount.length; i++) {
			tempArray[i] = this.cdAccount[i];
		}
		tempArray[numberOfCDAccount] = cdAccount;
		numberOfCDAccount++;
		this.cdAccount = tempArray;
		return cdAccount;
	}

	public CDAccount[] getCDAccounts() {
		return cdAccount;
	}

	public int getNumberOfCDAccounts() {
		return numberOfCDAccount;
	}

	public double getCDBalance() {
		cdAccountBalance = 0;
		for (CDAccount z : cdAccount) {
			cdAccountBalance += z.getBalance();
		}
		return cdAccountBalance;
	}

	public double getCombinedBalance() {

		return (getCheckingBalance() + getSavingsBalance() + getCDBalance());
	}

}