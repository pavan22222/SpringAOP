package com.vrnda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.IEmployee;

public class ThrowsAdviceAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		IEmployee emp=ctx.getBean("employee",IEmployee.class);
		System.out.println(emp.getClass().getName());
		System.out.println(emp.work("Pavan"));
		System.out.println(emp.work(null));

	}

}
