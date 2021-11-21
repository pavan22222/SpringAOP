package com.vrnda.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class CommonLoggerAspect {
	
	private static Logger logger =Logger.getLogger(CommonLoggerAspect.class);
	
	public void checkUser(JoinPoint jp) {
		System.out.println(Arrays.toString(jp.getArgs()));
		logger.fatal("SecurityAspect.checkUser()");
	}
}
