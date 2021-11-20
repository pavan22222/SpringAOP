package com.vrnda.beans;

public class BankService {

	public String getSimpleInterestAmount(double pamt, double roi, double time) {
		System.out.println("BankService.getSimpleInterestAmount()");
		return "Simple Interest Amount Is::"+(pamt*2*time-pamt);
	}

	public String getCompoundInterestAmount(double pamt, double roi, double time) {
		System.out.println("BankService.getCompoundInterestAmount");
		return "Compound Interest Amount Is::"+pamt *
                (Math.pow((1 + roi / 100), time));
	}
}
