package com.vrnda.beans;

import java.util.Arrays;

public class Hotel {
	
	public Double serve(String[] items) {
		System.out.println("Hotel.serve()");
		Double bill=0d;
		for(String s:items) {
			bill=bill+20;
		}
		System.out.println("Your Bills for::"+Arrays.toString(items)+" is::"+bill);
		return bill;
	}
}
