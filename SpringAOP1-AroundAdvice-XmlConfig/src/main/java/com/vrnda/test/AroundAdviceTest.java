package com.vrnda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.BankService;
import com.vrnda.beans.WishMessageGenerator;

public class AroundAdviceTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
//		WishMessageGenerator wmg=ctx.getBean("wmg", WishMessageGenerator.class);
//		System.out.println(wmg.getMessage("Pavan",null)+wmg.getClass().getName());
		BankService bank=ctx.getBean("bank", BankService.class);
		System.out.println(bank.getSimpleInterestAmount(100000,2, 1));
		System.out.println(bank.getCompoundInterestAmount(100000,2, 1));
	}
}
