package com.vrnda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.Hotel;

public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel.serve(new String[]{"Dosa","Idli"}));

	}

}
