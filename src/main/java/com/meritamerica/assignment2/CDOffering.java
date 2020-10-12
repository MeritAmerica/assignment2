package com.meritamerica.assignment2;

public class CDOffering {
	int term;
	double interestRate;
	
	CDOffering(){
	}
	
	CDOffering(int term, double interestRate){
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public int getTerm() {
		System.out.println(term);
		return term;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
}
