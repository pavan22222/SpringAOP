package com.vrnda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vrnda.beans.Employee;

@SpringBootApplication
public class SpringAop9BootAroundAdviceApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx=  SpringApplication.run(SpringAop9BootAroundAdviceApplication.class, args);
			Employee emp=ctx.getBean("employee",Employee.class);
			System.out.println(emp.getClass().getName());
			System.out.println(emp.work("Pavan"));
	}

}
