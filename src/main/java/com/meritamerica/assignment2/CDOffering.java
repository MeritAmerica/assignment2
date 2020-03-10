package com.meritamerica.assignment2;
/**
 * This class get the term and interest rate parameter by passing two getter methods.
 * @author ChrisJohnson
 *
 */

public class CDOffering {
	
	private int term;
	private double interestRate;

	public CDOffering(int term, double interestRate){
		this.term = term;
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

}