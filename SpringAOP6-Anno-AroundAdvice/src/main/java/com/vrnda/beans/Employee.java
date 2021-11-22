	package com.vrnda.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee implements  IEmployee {
	
	public String work(String user) {
		System.out.println("Employee.work()");
		return user+" Working";
	}
}
