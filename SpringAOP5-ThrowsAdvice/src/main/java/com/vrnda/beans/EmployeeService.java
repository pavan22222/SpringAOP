package com.vrnda.beans;

import java.util.List;

public class EmployeeService {
		public List<String> getEmployees(String user){
			System.out.println("EmployeeService.getEmployees()");
			if(true)
				throw new IllegalArgumentException();
			return List.of("Pavan","Naveen","Srikanth");
		}
}
