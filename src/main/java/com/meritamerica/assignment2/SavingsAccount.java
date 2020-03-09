package com.meritamerica.assignment2;
/**
 * This class holds and calculates all the parameters that are includes in  the SavingsAccount of MeritAmericaBank
 * @author ChrisJohnson
 *
 */

public class SavingsAccount {
	
	// Establishes class variables
	private double balance;
	private final double INTEREST_RATE = 0.01;
	private long acountNumber;
	
	// Default constructor method for the class
	public SavingsAccount(double openBalance){
		this.balance = openBalance;
		this.acountNumber = MeritBank.getNextAccountNumber();
	}
	
	// Returns the balance value of the object
	public double getBalance() {
		return balance;
	}
	
	// Returns the interest rate of the object
	public double getInterestRate() {
		return INTEREST_RATE;
	}
	
	// Returns the account number of the object
	public long getAccountNumber() {
		return acountNumber;
	}
	
	/* Method to withdraw an entered amount from the balance. 
	 * Ensures the amount parameter is not greater than the balance value.
	 * Ensures the amount parameter isn't a negative value. 
	 * Returns the balance value after computation.
	 */
	public boolean withdraw(double amount) {
		if(amount <= balance && amount > 0) {
			this.balance = balance - amount;
			System.out.println("Withdrawn amount: $" + amount);
			System.out.println("Remaining balance: $" + balance);
			return true;
		}
		return false;
	}
	
	/* Method to deposit an entered amount to the balance.
	 * Ensures the amount parameter isn't a negative value.
	 * Returns the balance value after computation.
	 */
	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance = balance + amount;
			System.out.println("Deposited amount: $" + amount);
			System.out.println("Total balance: $" + balance);
			return true;
		}
		return false;	
	}
	
	/* Method to calculate the value of the balance in a given amount of time.
	 * Returns the balance value after computation.
	 */
	public double futureValue(int years) {
		return balance*Math.pow(1 + INTEREST_RATE, years);
	}
	
	// Overrides the toString method to print out readable values
	public String toString() {
		return "Savings Account Balance: $" + balance + "\n" + 
				"Savings Account Interest Rate: " + INTEREST_RATE + "\n" + 
				"Savings Account Balance in 3 years: $" + futureValue(3);
	
	}

}