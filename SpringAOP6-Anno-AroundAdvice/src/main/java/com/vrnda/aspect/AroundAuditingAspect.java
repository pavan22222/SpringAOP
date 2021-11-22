package com.vrnda.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
//@Order(1)
public class AroundAuditingAspect {
	
	@Around("execution(* com.vrnda.beans.Employee.work(..))")
	public Object audit(ProceedingJoinPoint pjp)  throws Throwable{
		Object retVal=null;
		pjp.getArgs()[0]="Lakshmi";
		System.out.println("AroundAuditingAspectaudit()");
		long start=System.currentTimeMillis();
		retVal=pjp.proceed();
		long end=System.currentTimeMillis();
		System.out.println(Arrays.toString(pjp.getArgs())+" has worked for  "+(end-start) + " milli seconds");
		return retVal;
	}
}
