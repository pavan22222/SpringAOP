package com.vrnda.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class SecurityAspect {
	
	public void checkUser(JoinPoint jp) {
		System.out.println(Arrays.toString(jp.getArgs()));
		throw new IllegalArgumentException();
		//System.out.println("SecurityAspect.checkUser()");
	}
}
