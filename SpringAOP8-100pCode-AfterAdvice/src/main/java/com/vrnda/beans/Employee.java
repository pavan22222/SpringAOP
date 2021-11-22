	package com.vrnda.beans;

import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class Employee implements  IEmployee {
	
	public String work(String user) {
		if(Optional.ofNullable(user).isEmpty())
			throw new IllegalArgumentException();
		System.out.println("Employee.work()");
		return user+" Working";
	}
}
