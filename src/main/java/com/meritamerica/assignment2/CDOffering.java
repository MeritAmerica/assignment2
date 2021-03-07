package com.meritamerica.assignment2;

public class CDOffering {

	int term;
	
	double intrestRate;

	public CDOffering(int term, double intrestRate) {
		this.term = term;
		this.intrestRate = intrestRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	
}
