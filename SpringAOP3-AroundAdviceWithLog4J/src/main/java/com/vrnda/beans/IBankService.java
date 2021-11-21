package com.vrnda.beans;

public interface IBankService {
	
	String getSimpleInterestAmount(double pamt, double roi, double time);
	
	String getCompoundInterestAmount(double pamt, double roi, double time);
	
}
