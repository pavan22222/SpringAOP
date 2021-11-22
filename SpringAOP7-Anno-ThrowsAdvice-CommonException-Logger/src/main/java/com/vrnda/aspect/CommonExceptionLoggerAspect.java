package com.vrnda.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
//@Order(1)
public class CommonExceptionLoggerAspect {
	
	@AfterThrowing(value="execution(* com.vrnda.beans.Employee.work(..))")
	public void exceptionHandler(JoinPoint jp)throws Throwable {
		System.out.println("CommonExceptionLoggerAspect.audit()");
		System.out.println("Exception is raised in "+jp.getSignature());
	}
}
