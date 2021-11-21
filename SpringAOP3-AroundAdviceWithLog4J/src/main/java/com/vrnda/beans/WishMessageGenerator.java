package com.vrnda.beans;

import java.util.Calendar;

public class WishMessageGenerator {
	private Calendar calender;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-Param Constructor");
	}


	public void setCalender(Calendar calender) {
		System.out.println("WishMessageGenerator.setCalender()");
		this.calender = calender;
	}
	
	
	public String getMessage(String user,String[] args) {
		System.out.println("WishMessageGenerator.getMessage()");
		String retMsg=null;
		Integer hour=calender.get(Calendar.HOUR_OF_DAY);
		if(hour > 12) {
			retMsg="Good Morning";
		}else if(hour > 16) {
			retMsg="Good AfterNoon";
		}else if(hour > 20) {
			retMsg="Good Evening";
		}else {
			retMsg="Good Night";
		}
		return retMsg+" "+user;
	}
	
	
	
	
}
