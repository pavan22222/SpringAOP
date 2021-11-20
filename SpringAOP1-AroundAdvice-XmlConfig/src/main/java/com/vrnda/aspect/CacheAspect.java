package com.vrnda.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAspect {
	private HashMap<String,String> cache=new HashMap();
	public Object cache(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("CacheAspect.cache()");
		String key=Arrays.toString(pjp.getArgs());
		Object value=null;
		if(cache.get(key) == null) {
			value=pjp.proceed();
			cache.put(key,  value.toString());
		} else {
			value=cache.get(key) ;
		}
		return "Pavan";
	}
}
