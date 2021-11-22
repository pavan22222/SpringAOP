package com.vrnda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vrnda.beans.IEmployee;
import com.vrnda.cfgs.AppConfig;

public class AfterAdviceAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployee emp=ctx.getBean("employee",IEmployee.class);
		System.out.println(emp.getClass().getName());
		System.out.println(emp.work("Pavan"));

	}

}
