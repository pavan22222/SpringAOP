package com.vrnda.aspect;

import java.util.Arrays;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdviceAspect  {
	
	private static Logger logger=Logger.getLogger(AroundAdviceAspect.class);
	
	public AroundAdviceAspect() {
		System.out.println("AroundAdviceAspect 0-Param Constructor");
	}

	public Object invoke(ProceedingJoinPoint pjp) throws Throwable {
		logger.debug("AroundAdviceAspect.invoke()");
		System.out.println("AroundAdviceAspect.invoke()");
		long start=System.currentTimeMillis();
		Object obj=pjp.proceed();
		long end=System.currentTimeMillis();
		System.out.println(pjp.getClass().getName()+" Has Taken "+(end-start)+" Milli Seconds to Execute"+pjp.getSignature());
		System.out.println(Arrays.toString(pjp.getArgs()));
		return obj;
	}

}
