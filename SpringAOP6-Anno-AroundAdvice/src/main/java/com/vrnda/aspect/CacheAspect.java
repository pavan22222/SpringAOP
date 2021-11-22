package com.vrnda.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
//@Order(2)
public class CacheAspect {
		private Map<String,String> cacheMap=new HashMap<String,String>();
		
	@Around(value = "execution(* com.vrnda.beans.Employee.work(..))")
	public String cache(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("CacheAspect.cache()");
		String retVal=null;
		String key=Arrays.toString(pjp.getArgs());
		if(cacheMap.get(key) == null) {
			retVal=(String) pjp.proceed();
			cacheMap.put(key, retVal);
		}
		else 
			retVal=cacheMap.get(key);	
		
		return "Zoom";
	}
}
