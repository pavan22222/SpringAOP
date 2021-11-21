package com.vrnda.aspect;

import org.aspectj.lang.JoinPoint;

public class AfterAdviceAspect {
	
	public void checkBill(JoinPoint jp,Double billAmount) {
		System.out.println("AfterAdvice.checkBill()");
		//System.out.print("is::"+billAmount);
		//throw new IllegalArgumentException();
	}
}
