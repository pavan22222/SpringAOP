package com.vrnda.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.EmployeeService;

public class BeforeAdviceTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		EmployeeService service=ctx.getBean("empService",EmployeeService.class);
		System.out.println(service.getEmployees("Pavan"));
	}
}
