package com.vrnda.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LuckyDrawAspect {
	
	@Pointcut("execution(* com.vrnda.beans.Employee.work(..))")
	private void myPct() {
		
	}
	
	@AfterReturning(value="myPct()",returning = "user")
	public void draw(JoinPoint jp,String user)throws Throwable {
		System.out.println("LuckyDrawAspect.draw()");
		System.out.println("Returned Value is::"+user);
	}
	
	@Before(value="myPct()")
	public void checkUser(JoinPoint j)throws Throwable {
		System.out.println("LuckyDrawAspect.checkUser()");
	}
}
