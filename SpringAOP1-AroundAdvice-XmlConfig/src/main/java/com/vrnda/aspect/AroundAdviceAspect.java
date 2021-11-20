package com.vrnda.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdviceAspect  {

	
	public Object invoke(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("AroundAdviceAspect.invoke()");
		long start=System.currentTimeMillis();
		Object obj=pjp.proceed();
		long end=System.currentTimeMillis();
		System.out.println(pjp.getClass().getName()+" Has Taken "+(end-start)+" Milli Seconds to Execute"+pjp.getSignature());
		System.out.println(Arrays.toString(pjp.getArgs()));
		return obj;
	}

}
